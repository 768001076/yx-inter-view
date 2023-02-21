package com.test.yxtest.service;

import com.test.yxtest.ao.SortAO;
import com.test.yxtest.entity.YxSort;
import com.baomidou.mybatisplus.extension.service.IService;
import com.test.yxtest.vo.SortResultVO;

/**
 * <p>
 * 益先排序笔试题 服务类
 * </p>
 *
 * @author Shijialei
 * @since 2023-02-20
 */
public interface IYxSortService extends IService<YxSort> {

    /**
     * 排序方法
     * @param sortAO 排序参数
     * @return com.test.yxtest.vo.SortResultVO
     * @author shijialei
     */
    <T> SortResultVO<T> sort(SortAO<T> sortAO);

    /**
     * 保存排序信息
     * @param sortResultVO 排序结果信息
     * @author shijialei
     */
    <T> void saveSortInfo(SortResultVO<T> sortResultVO);
}
