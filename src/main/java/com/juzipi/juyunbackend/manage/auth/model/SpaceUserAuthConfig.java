package com.juzipi.juyunbackend.manage.auth.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName SpaceUserAuthConfig
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2025/1/21 9:28
 */
@Data
public class SpaceUserAuthConfig implements Serializable {

    /**
     * 权限列表
     */
    private List<SpaceUserPermission> permissions;

    /**
     * 角色列表
     */
    private List<SpaceUserRole> roles;

    private static final long serialVersionUID = 1L;
}