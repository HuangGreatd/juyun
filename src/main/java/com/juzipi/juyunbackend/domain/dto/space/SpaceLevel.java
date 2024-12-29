package com.juzipi.juyunbackend.domain.dto.space;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName SpaceLevel
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2024/12/29 16:49
 */
@Data
@AllArgsConstructor
public class SpaceLevel {

    private int value;

    private String text;

    private long maxCount;

    private long maxSize;
}
