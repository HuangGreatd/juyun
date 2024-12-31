package com.juzipi.juyunbackend.domain.dto.space.analyze;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SpaceAnalyzeRequest
 * @Description: 通用空间分析请求
 * @Author: 橘子皮
 * @CreateDate: 2024/12/31 10:32
 */
@Data
public class SpaceAnalyzeRequest implements Serializable {

    /**
     * 空间 ID
     */
    private Long spaceId;

    /**
     * 是否查询公共图库
     */
    private boolean queryPublic;

    /**
     * 全空间分析
     */
    private boolean queryAll;

    private static final long serialVersionUID = 1L;
}