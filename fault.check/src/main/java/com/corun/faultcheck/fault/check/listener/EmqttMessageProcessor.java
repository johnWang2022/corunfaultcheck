package com.corun.faultcheck.fault.check.listener;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EmqttMessageProcessor implements MqttCallback {

    @Autowired
    private WebsocketHandler handler;

    @Override
    public void connectionLost(Throwable throwable) {
        log.info(" connection is lost ");
    }

    @Override
    public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
        log.info(" message arrived  {}", s);
        handler.sendMessage(mqttMessage.toString());
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        log.info(" deliver complete ");
    }
}
