package cn.osxm.ssmi.chp05.anno;

import cn.osxm.ssmi.chp04.Chp04Demo;
import cn.osxm.ssmi.chp04.model.Bar;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@MyAnnotation
public class MyAnnotationDemo {
    @MyAnnotation
    public void annoMethod() {
        System.out.println("方法本身执行");
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml", MyAnnotationDemo.class);

        Object user = applicationContext.getBean("userByMethod");

        MyAnnotationDemo myAnnotationDemo = new MyAnnotationDemo();
        //获取使用在类上的自定义注解
        if (myAnnotationDemo.getClass().isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnnotation = myAnnotationDemo.getClass().getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation);
        }

        //获取使用在方法上的自定义注解
        Method annoMethod = myAnnotationDemo.getClass().getMethod("annoMethod");
        annoMethod.invoke(myAnnotationDemo, null);
        Annotation[] annotations = annoMethod.getAnnotations();
        if (annoMethod.isAnnotationPresent(MyAnnotation.class)) {
            System.out.println("方法添加了 MyAnnotation 注解，再干点其他事......");
        }

        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean("foo"));
        context.register(Bar.class);
        context.refresh();

        context.scan("cn.osxm.ssmi.com.chp05");
        context.refresh();
    }
}
