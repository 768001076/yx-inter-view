package com.test.yxtest.ao;

import java.util.Comparator;
import java.util.List;

/**
 * 排序参数
 *
 * @author shijialei
 * @date 2023/2/20
 */
public interface SortAO<T> {

    /**
     * 获取元数据
     * @return java.util.List<T>
     * @author shijialei
     */
    List<T> getMetadata();

    /**
     * 获取排序方法
     * @return java.util.Comparator<T>
     * @author shijialei
     */
    Comparator<T> getSortMethod();

}
