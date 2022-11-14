package cn.osxm.ssmi.chp05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//运行时注解
//可以使用在类和方法上
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface MyAnnotation {
}
