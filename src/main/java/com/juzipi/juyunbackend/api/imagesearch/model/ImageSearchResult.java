package com.juzipi.juyunbackend.api.imagesearch.model;

import lombok.Data;

/**
 * @ClassName ImageSearchResult
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2024/12/30 14:36
 */
@Data
public class ImageSearchResult {

    /**
     * 缩略图地址
     */
    private String thumbUrl;

    /**
     * 来源地址
     */
    private String fromUrl;
}
