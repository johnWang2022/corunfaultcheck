package com.corun.faultcheck.fault.check.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.Objects;

@Component
@Slf4j
public class WebsocketHandler extends TextWebSocketHandler {

    private WebSocketSession webSocketSession;

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        super.handleTextMessage(session, message);
        session.sendMessage(new TextMessage("connection success! "));
        this.webSocketSession = session;
    }

    public void sendMessage(String message) {
        try {
            if (Objects.nonNull(this.webSocketSession)) {
                this.webSocketSession.sendMessage(new TextMessage(message));
            }else{
                log.error(" web do not establish connection ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
