package com.juzipi.juyunbackend.domain.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SearchPictureByPictureRequest
 * @Description:以图搜图请求
 * @Author: 橘子皮
 * @CreateDate: 2024/12/30 14:49
 */
@Data
public class SearchPictureByPictureRequest implements Serializable {
    /**
     * 图片 id
     */
    private Long pictureId;
    private static final long serialVersionUID = 1L;
}