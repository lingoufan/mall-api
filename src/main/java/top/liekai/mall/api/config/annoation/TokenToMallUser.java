package top.liekai.mall.api.config.annoation;

import java.lang.annotation.*;

/**
 * @author admin
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TokenToMallUser {
    /**
     * 当前用户在request中的名字
     * * @return String
     */
    String value() default "user";
}