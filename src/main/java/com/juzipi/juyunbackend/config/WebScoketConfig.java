package com.juzipi.juyunbackend.config;

import com.juzipi.juyunbackend.manage.websocket.PictureEditHandler;
import com.juzipi.juyunbackend.manage.websocket.WsHandshakeInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import javax.annotation.Resource;

/**
 * @ClassName WebScoketConfig
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2025/1/26 18:32
 */
@Configuration
@EnableWebSocket
public class WebScoketConfig implements WebSocketConfigurer {
    @Resource
    private PictureEditHandler pictureEditHandler;

    @Resource
    private WsHandshakeInterceptor wsHandshakeInterceptor;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        //weobsocket
        registry.addHandler(pictureEditHandler, "/ws/picture/edit")
                .addInterceptors(wsHandshakeInterceptor)
                .setAllowedOrigins("*");
    }
}
