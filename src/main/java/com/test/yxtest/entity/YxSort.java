package com.test.yxtest.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * <p>
 * 益先排序笔试题
 * </p>
 *
 * @author Shijialei
 * @since 2023-02-20
 */
@Data
@TableName("yx_sort")
public class YxSort implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;
    /**
     * 请求序列号
     */
    private String requestNumber;

    /**
     * 数据
     */
    private String data;

    /**
     * 排序值
     */
    private Integer sort;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;
}
