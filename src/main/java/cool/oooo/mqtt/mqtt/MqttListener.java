package cool.oooo.mqtt.mqtt;

import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * @author LiuYang
 * @date 2022/11/7 18:38
 */
public interface MqttListener {

    /**
     * consume mqtt msg
     *
     * @param mqttMessage msg
     */
    void consume(MqttMessage mqttMessage);
}
