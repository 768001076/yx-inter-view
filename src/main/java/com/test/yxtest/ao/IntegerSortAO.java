package com.test.yxtest.ao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 整数排序参数
 *
 * @author shijialei
 * @date 2023/2/20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IntegerSortAO implements SortAO, Serializable {

    private static final long serialVersionUID = -6889544123688187623L;
    /**
     * 整数数据
     */
    private List<Integer> integers;

    @Override
    public List<String> getMetadata() {
        return integers.stream().map(String::valueOf).collect(Collectors.toList());
    }
}
