package com.juzipi.juyunbackend.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName SpaceUser
 * @Description:空间用户关联
 * @Author: 橘子皮
 * @CreateDate: 2025/1/18 11:52
 */
@TableName(value = "space_user")
@Data
public class SpaceUser {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 空间 id
     */
    private Long spaceId;
    /**
     * 用户 id
     */
    private Long userId;
    /**
     * 空间角色：viewer/editor/admin
     */
    private String spaceRole;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}