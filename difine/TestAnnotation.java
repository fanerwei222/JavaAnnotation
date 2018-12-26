package main.annotation.difine;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 测试注解
 * @author fanwei
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation
{
    public String[] value() default "unknown";
}
