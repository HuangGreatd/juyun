package com.juzipi.juyunbackend.manage.auth.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SpaceUserPermission
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2025/1/21 9:29
 */
@Data
public class SpaceUserPermission implements Serializable {

    /**
     * 权限键
     */
    private String key;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限描述
     */
    private String description;

    private static final long serialVersionUID = 1L;

}