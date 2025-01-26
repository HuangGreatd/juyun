package com.juzipi.juyunbackend.domain.dto.spaceuser;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SpaceUserEditRequest
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2025/1/18 16:43
 */
@Data
public class SpaceUserEditRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 空间角色：viewer/editor/admin
     */
    private String spaceRole;

    private static final long serialVersionUID = 1L;
}