package cool.oooo.mqtt.mqtt;

import java.lang.annotation.*;

/**
 * @author LiuYang
 * @date 2022/12/1 14:30
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface RegularMqttSubscriptionOnMethod {

    String topic();

    String expression() default "";
}
