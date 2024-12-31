package com.juzipi.juyunbackend.domain.dto.picture;

import com.juzipi.juyunbackend.api.aliyunai.model.CreateOutPaintingTaskRequest;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName CreatePictureOutPaintingTaskRequest
 * @Description: AI 扩图请求
 * @Author: 橘子皮
 * @CreateDate: 2024/12/31 10:05
 */
@Data
public class CreatePictureOutPaintingTaskRequest implements Serializable {

    /**
     * 图片 id
     */
    private Long pictureId;

    /**
     * 扩图参数
     */
    private CreateOutPaintingTaskRequest.Parameters parameters;

    private static final long serialVersionUID = 1L;
}
