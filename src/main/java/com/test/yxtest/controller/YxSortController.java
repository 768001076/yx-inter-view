package com.test.yxtest.controller;

import com.test.yxtest.ao.EnhanceSortAO;
import com.test.yxtest.ao.IntegerSortAO;
import com.test.yxtest.service.IYxSortService;
import com.test.yxtest.vo.SortResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

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
    public SortResultVO integerSort(@RequestBody IntegerSortAO integerSortAO){
        return yxSortService.sort(integerSortAO);
    }

    /**
     * 增强排序
     * @param enhanceSortAO 待排序数据
     * @return com.test.yxtest.vo.SortResultVO
     * @author shijialei
     */
    @PostMapping("enhanceSort")
    public SortResultVO enhanceSort(@RequestBody EnhanceSortAO enhanceSortAO){
        return yxSortService.sort(enhanceSortAO);
    }

}
