package com.juzipi.juyunbackend.domain.dto.picture;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName PictureUpdateRequest
 * @Description:图片更新请求
 * @Author: 橘子皮
 * @CreateDate: 2024/12/16 8:44
 */
@Data
public class PictureUpdateRequest implements Serializable {
    /**
     * id
     */
    private Long id;
    /**
     * 图片名称
     */
    private String name;
    /**
     * 简介
     */
    private String introduction;
    /**
     * 分类
     */
    private String category;
    /**
     * 标签
     */
    private List<String> tags;
    private static final long serialVersionUID = 1L;
}