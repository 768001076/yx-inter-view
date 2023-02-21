package com.test.yxtest.controller;

import com.test.yxtest.ao.BigDecimalSortAO;
import com.test.yxtest.ao.StringSortAO;
import com.test.yxtest.ao.IntegerSortAO;
import com.test.yxtest.service.IYxSortService;
import com.test.yxtest.vo.SortResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * <p>
 * 益先排序笔试题 前端控制器
 * </p>
 *
 * @author Shijialei
 * @since 2023-02-20
 */
@RestController
@RequestMapping("/yxtest/yxSort")
public class YxSortController {

    @Autowired
    IYxSortService yxSortService;

    /**
     * 整数排序
     * @param integerSortAO 待排序数据
     * @return com.test.yxtest.vo.SortResultVO
     * @author shijialei
     */
    @PostMapping("integerSort")
    public SortResultVO<Integer> integerSort(@RequestBody IntegerSortAO integerSortAO){
        return yxSortService.sort(integerSortAO);
    }

    /**
     * 浮点数值排序
     * @param bigDecimalSortAO 待排序数据
     * @return com.test.yxtest.vo.SortResultVO
     * @author shijialei
     */
    @PostMapping("bigDecimalSort")
    public SortResultVO<BigDecimal> bigDecimalSort(@RequestBody BigDecimalSortAO bigDecimalSortAO){
        return yxSortService.sort(bigDecimalSortAO);
    }

    /**
     * 字符排序
     * @param stringSortAO 待排序数据
     * @return com.test.yxtest.vo.SortResultVO
     * @author shijialei
     */
    @PostMapping("stringSort")
    public SortResultVO<String> stringSort(@RequestBody StringSortAO stringSortAO){
        return yxSortService.sort(stringSortAO);
    }

}
