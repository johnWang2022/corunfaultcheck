package com.corun.faultcheck.fault.check;

import com.corun.faultcheck.fault.check.config.EmqxConfig;
import com.corun.faultcheck.fault.check.config.WebSocketConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@SpringBootApplication
@ComponentScan(value="com.corun.faultcheck.fault.check")
@MapperScan("com.corun.faultcheck.fault.check.dao")
@EnableWebSocket
public class Application{

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
//		EmqxConfig bean = run.getBean(EmqxConfig.class);
//		System.out.println(bean.getBroke());
	}
}
