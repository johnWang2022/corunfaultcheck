package com.corun.faultcheck.fault.check.listener;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

@Component
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
            this.webSocketSession.sendMessage(new TextMessage(message));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
