package com.juzipi.juyunbackend.domain.dto.space;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SpaceEditRequest
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2024/12/29 15:27
 */
@Data
public class SpaceEditRequest implements Serializable {

    /**
     * 空间 id
     */
    private Long id;

    /**
     * 空间名称
     */
    private String spaceName;

    private static final long serialVersionUID = 1L;
}