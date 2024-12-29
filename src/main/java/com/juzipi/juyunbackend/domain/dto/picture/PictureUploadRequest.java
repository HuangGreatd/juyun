package com.juzipi.juyunbackend.domain.dto.picture;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName PictureUploadRequest
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2024/12/15 15:30
 */
@Data
public class PictureUploadRequest implements Serializable {

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

    /**
     * 文件地址
     */
    private String fileUrl;

    /**
     * 空间 id
     */
    private Long spaceId;

    private static final long serialVersionUID = 1L;
}

