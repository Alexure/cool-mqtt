package cool.oooo.mqtt.mqtt;

import java.lang.annotation.*;

/**
 * @author LiuYang
 * @date 2022/11/8 20:22
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface MqttSubscriptionOnMethod {

    String topic();

    String expression() default "";
}
