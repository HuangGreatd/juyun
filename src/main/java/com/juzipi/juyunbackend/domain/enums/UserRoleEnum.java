package com.juzipi.juyunbackend.domain.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserRoleEnum
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2024/12/15 8:45
 */
@Getter
public enum UserRoleEnum {

    USER("用户", "user"),
    ADMIN("管理员", "admin"),
    BAN("封禁", "ban"),
    VIP("会员", "vip");

    private final String text;

    private final String value;

    //Map用于缓存枚举值，key为枚举的value，value为对应的枚举对象
    private static final Map<String, UserRoleEnum> VALUE_MAP = new HashMap<>();

    static {
        // 在类加载时，将所有枚举值放入Map中进行缓存
        for (UserRoleEnum anEnum : UserRoleEnum.values()) {
            VALUE_MAP.put(anEnum.value, anEnum);
        }
    }

    UserRoleEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value 枚举值的value
     * @return 枚举值
     */
    public static UserRoleEnum getEnumByValue(String value) {
        if (ObjUtil.isEmpty(value)) {
            return null;
        }
        return VALUE_MAP.get(value);
    }
}

