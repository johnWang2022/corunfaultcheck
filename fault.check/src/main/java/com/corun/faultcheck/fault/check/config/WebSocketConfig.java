package com.corun.faultcheck.fault.check.config;


import com.corun.faultcheck.fault.check.listener.WebsocketHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Component
public class WebSocketConfig extends SpringBootServletInitializer implements WebSocketConfigurer {

    @Autowired
    private WebsocketHandler websocketHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(this.websocketHandler,"/echo").withSockJS();
    }
}