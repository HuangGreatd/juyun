package com.juzipi.juyunbackend.common;

import com.juzipi.juyunbackend.constant.CommonConstant;
import lombok.Data;

import java.io.Serializable;

/**
 * 通用分页请求参数
 *

 */
@Data
public class PageRequest implements Serializable {

    private static final long serialVersionUID = -5860707094194210842L;

    /**
     * 页面大小
     */
    protected int pageSize = 10;

    /**
     * 当前是第几页
     */
    protected int current = 1;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
