package com.test.yxtest.ao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/**
 * 整数排序参数
 *
 * @author shijialei
 * @date 2023/2/20
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IntegerSortAO extends BaseSortAO implements SortAO<Integer>, Serializable {

    private static final long serialVersionUID = -6889544123688187623L;
    /**
     * 整数数据
     */
    private List<Integer> integers;

    @Override
    public List<Integer> getMetadata() {
        return integers;
    }

    @Override
    public Comparator<Integer> getSortMethod() {
        return isAsc() ? Comparator.naturalOrder() : Comparator.reverseOrder();
    }
}
