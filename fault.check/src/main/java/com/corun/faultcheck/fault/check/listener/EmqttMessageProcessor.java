package com.corun.faultcheck.fault.check.listener;

import com.corun.faultcheck.fault.check.manager.CreateFaultManger;
import com.corun.faultcheck.fault.check.modelVO.FaultListInfo;
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
    @Autowired
    private CreateFaultManger createFaultManger;

    @Override
    public void connectionLost(Throwable throwable) {
        log.info(" connection is lost ");
    }

    @Override
    public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
        try {
            log.info(" message arrived  {}", s);
            handler.sendMessage(mqttMessage.toString());
            this.createFaultManger.createFaultInfo(FaultListInfo.getFaultList(mqttMessage.toString()));
        } catch (Exception e) {
            log.error(" message arrived with error :",e.getMessage());
        }

    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        log.info(" deliver complete ");
    }
}
