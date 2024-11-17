package cool.oooo.mqtt.mqtt;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author LiuYang
 * @date 2022/11/29 18:04
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Component
public @interface RegularMqttSubscription {

    String topic();

    String expression() default "";
}
