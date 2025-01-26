package com.juzipi.juyunbackend.manage.auth.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName SpaceUserRole
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2025/1/21 9:29
 */
@Data
public class SpaceUserRole implements Serializable {

    /**
     * 角色键
     */
    private String key;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 权限键列表
     */
    private List<String> permissions;

    /**
     * 角色描述
     */
    private String description;

    private static final long serialVersionUID = 1L;
}