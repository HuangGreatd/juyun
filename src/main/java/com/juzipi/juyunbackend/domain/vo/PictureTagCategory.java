package com.juzipi.juyunbackend.domain.vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName PictureTagCategory
 * @Description:图片标签分类列表视图
 * @Author: 橘子皮
 * @CreateDate: 2024/12/16 8:46
 */
@Data
public class PictureTagCategory {
    /**
     * 标签列表
     */
    private List<String> tagList;
    /**
     * 分类列表
     */
    private List<String> categoryList;
}
