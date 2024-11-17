package cool.oooo.mqtt.impl;

import cool.oooo.mqtt.mqtt.MqttListener;
import cool.oooo.mqtt.mqtt.MqttSubscription;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * 空实现
 *
 * @author LiuYang
 * @date 2022/11/7 18:44
 */
@MqttSubscription(topic = "test")
public class VoidConsumer implements MqttListener {

    @Override
    public void consume(MqttMessage mqttMessage) {

    }
}