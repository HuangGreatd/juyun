package com.juzipi.juyunbackend.domain.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName UserLoginRequest
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2024/12/15 8:59
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}
