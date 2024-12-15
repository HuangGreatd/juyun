package com.juzipi.juyunbackend.constant;

/**
 * @ClassName UserConstant
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2024/12/15 9:02
 */
public interface UserConstant {

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "user_login";

    //  region 权限

    /**
     * 默认角色
     */
    String DEFAULT_ROLE = "user";

    /**
     * 管理员角色
     */
    String ADMIN_ROLE = "admin";

    /**
     * 封禁角色
     */
    String BAN_ROLE = "ban";

    /**
     * vip 角色
     */
    String VIP_ROLE = "vip";
    // endregion
}
