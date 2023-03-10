package com.test.yxtest.vo;

import lombok.Data;

import java.util.List;

/**
 * 排序结果对象
 *
 * @author shijialei
 * @date 2023/2/20
 */
@Data
public class SortResultVO<T> {

    /**
     * 请求编号
     */
    private String requestNumber;
    /**
     * 元数据
     */
    private List<T> metadata;
    /**
     * 排序数据
     */
    private List<T> sortData;

}
