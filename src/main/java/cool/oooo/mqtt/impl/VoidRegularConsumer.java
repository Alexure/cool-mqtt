package cool.oooo.mqtt.impl;

import cool.oooo.mqtt.mqtt.RegularMqttListener;
import cool.oooo.mqtt.mqtt.RegularMqttSubscription;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * 空实现
 *
 * @author LiuYang
 * @date 2022/11/29 18:27
 */
@RegularMqttSubscription(topic = "/+/+/test/topic")
public class VoidRegularConsumer implements RegularMqttListener {

    @Override
    public void consume(String topic, MqttMessage mqttMessage) {

    }
}
