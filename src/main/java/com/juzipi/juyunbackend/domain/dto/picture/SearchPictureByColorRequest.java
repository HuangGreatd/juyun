package com.juzipi.juyunbackend.domain.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SearchPictureByColorRequest
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2024/12/30 16:51
 */
@Data
public class SearchPictureByColorRequest implements Serializable {

    /**
     * 图片主色调
     */
    private String picColor;

    /**
     * 空间 id
     */
    private Long spaceId;

    private static final long serialVersionUID = 1L;
}