package cool.oooo.mqtt.mqtt;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author LiuYang
 * @date 2022/11/7 18:30
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Component
public @interface MqttSubscription {

    String topic();

    String expression() default "";
}
