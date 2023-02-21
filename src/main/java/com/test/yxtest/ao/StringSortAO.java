package com.test.yxtest.ao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/**
 * 字符类型排序参数
 *
 * @author shijialei
 * @date 2023/2/20
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StringSortAO extends BaseSortAO implements SortAO<String>, Serializable {

    private static final long serialVersionUID = 6892630576411137312L;
    /**
     * 字符数据
     */
    private List<String> data;

    @Override
    public List<String> getMetadata() {
        return data;
    }

    @Override
    public Comparator<String> getSortMethod() {
        Collator instance = Collator.getInstance(Locale.CHINA);
        return isAsc() ? instance::compare : ((Comparator<String>) instance::compare).reversed();
    }
}
