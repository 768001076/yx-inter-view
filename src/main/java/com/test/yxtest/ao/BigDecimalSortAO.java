package com.test.yxtest.ao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

/**
 * 浮点类型数值排序参数
 *
 * @author shijialei
 * @date 2023/2/21
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BigDecimalSortAO extends BaseSortAO implements SortAO<BigDecimal>, Serializable {

    private static final long serialVersionUID = -6757120120252645941L;
    /**
     * 浮点数据
     */
    private List<BigDecimal> bigDecimals;

    @Override
    public List<BigDecimal> getMetadata() {
        return bigDecimals;
    }

    @Override
    public Comparator<BigDecimal> getSortMethod() {
        return isAsc() ? Comparator.naturalOrder() : Comparator.reverseOrder();
    }
}
