package com.juzipi.juyunbackend.domain.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName PictureReviewRequest
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2024/12/16 15:17
 */
@Data
public class PictureReviewRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 状态：0-待审核, 1-通过, 2-拒绝
     */
    private Integer reviewStatus;

    /**
     * 审核信息
     */
    private String reviewMessage;


    private static final long serialVersionUID = 1L;
}

