package com.test.yxtest.ao;

import lombok.Data;

/**
 * 基础排序参数
 *
 * @author shijialei
 * @date 2023/2/21
 */
@Data
public abstract class BaseSortAO {
    /**
     * 排序顺序
     */
    private boolean asc;
}
