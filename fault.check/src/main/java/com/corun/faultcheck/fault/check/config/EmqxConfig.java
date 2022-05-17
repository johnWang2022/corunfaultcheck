package com.corun.faultcheck.fault.check.config;

import com.corun.faultcheck.fault.check.listener.EmqttMessageProcessor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Objects;


@ConfigurationProperties(value = "emqx-config")
@Component
@Slf4j
@Data
public class EmqxConfig {

    private String subTopic;
    private String pubTopic;
    private String broke;
    private String username;
    private String password;
    private String clientId;
    private Integer qos;
    private Integer keepLive;
    private Object lockInfo = new Object();
    private MqttClient mqttClient;

    @Autowired
    private EmqttMessageProcessor emqttMessageProcessor;

    @PostConstruct
    public MqttClient getMqttClient(){
        synchronized (lockInfo) {
            if (Objects.isNull(mqttClient)) {
                this.mqttClient = createMqttClient();
            }
        }
        return mqttClient;
    }
    private MqttClient createMqttClient(){
        MemoryPersistence persistence = new MemoryPersistence();
        MqttClient client;
        try {
            log.info(" start connection broke: {},client Id :{}, persistence :{}", this.broke, this.clientId, persistence);
            client = new MqttClient(this.broke, this.clientId, persistence);
            MqttConnectOptions connectOptions = new MqttConnectOptions();
            connectOptions.setUserName(this.username);
            connectOptions.setPassword(this.password.toCharArray());
            connectOptions.setCleanSession(true);
            connectOptions.setKeepAliveInterval(this.keepLive);
            client.setCallback(this.emqttMessageProcessor);
            client.connect(connectOptions);
            client.subscribe(this.subTopic);
            log.info(" end to subscribe the topic {}", this.subTopic);
        } catch (MqttException e) {
            throw new RuntimeException(e);
        }
        return client;
    }
}
