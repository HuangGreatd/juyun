package com.juzipi.juyunbackend.manage.websocket.disruptor;

import com.juzipi.juyunbackend.domain.entity.User;
import com.juzipi.juyunbackend.manage.websocket.model.PictureEditRequestMessage;
import lombok.Data;
import org.springframework.web.socket.WebSocketSession;

/**
 * @ClassName PictureEditEvent
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2025/1/27 11:00
 */
@Data
public class PictureEditEvent {
    /**
     * 消息
     */
    private PictureEditRequestMessage pictureEditRequestMessage;

    /**
     * 当前用户的 session
     */
    private WebSocketSession session;

    /**
     * 当前用户
     */
    private User user;

    /**
     * 图片 id
     */
    private Long pictureId;
}
