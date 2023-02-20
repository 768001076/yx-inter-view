package com.test.yxtest.ao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 增强排序参数
 *
 * @author shijialei
 * @date 2023/2/20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnhanceSortAO implements SortAO, Serializable {

    private static final long serialVersionUID = 6892630576411137312L;
    /**
     * 整数数据
     */
    private List<String> data;

    @Override
    public List<String> getMetadata() {
        return data;
    }
}
