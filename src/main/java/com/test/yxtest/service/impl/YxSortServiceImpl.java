package com.test.yxtest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.yxtest.ao.SortAO;
import com.test.yxtest.entity.YxSort;
import com.test.yxtest.mapper.YxSortMapper;
import com.test.yxtest.service.IYxSortService;
import com.test.yxtest.vo.SortResultVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.Collator;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * <p>
 * 益先排序笔试题 服务实现类
 * </p>
 *
 * @author Shijialei
 * @since 2023-02-20
 */
@Service
public class YxSortServiceImpl extends ServiceImpl<YxSortMapper, YxSort> implements IYxSortService {

    @Override
    public SortResultVO sort(SortAO sortAO) {
        // 排序返回信息
        SortResultVO sortResultVO = new SortResultVO();
        // 记录请求编号
        sortResultVO.setRequestNumber(UUID.randomUUID().toString());
        // 元数据
        sortResultVO.setMetadata(sortAO.getMetadata());
        // 排序数据
        sortResultVO.setSortData(
                sortResultVO.getMetadata().stream()
                        .sorted(Collator.getInstance(Locale.CHINA))
                        .collect(Collectors.toList())
        );
        // 保存数据
        saveSortInfo(sortResultVO);
        // 返回信息
        return sortResultVO;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveSortInfo(SortResultVO sortResultVO) {
        // 请求编号
        String requestNumber = sortResultVO.getRequestNumber();
        // 当前时间
        LocalDateTime now = LocalDateTime.now();
        // 元数据
        List<YxSort> metadata = sortResultVO.getMetadata().stream()
                .map(data -> {
                    YxSort yxSort = new YxSort();
                    yxSort.setRequestNumber(requestNumber);
                    yxSort.setData(data);
                    yxSort.setCreateDate(now);
                    return yxSort;
                })
                .collect(Collectors.toList());
        // 保存元数据
        saveBatch(metadata);
        // 排序值
        AtomicInteger sortNum = new AtomicInteger();
        // 排序数据
        List<YxSort> sortData = sortResultVO.getSortData().stream()
                .map(data -> {
                    YxSort yxSort = new YxSort();
                    yxSort.setRequestNumber(requestNumber);
                    yxSort.setData(data);
                    yxSort.setSort(sortNum.getAndIncrement());
                    yxSort.setCreateDate(now);
                    return yxSort;
                })
                .collect(Collectors.toList());
        // 保存排序数据
        saveBatch(sortData);
    }
}
