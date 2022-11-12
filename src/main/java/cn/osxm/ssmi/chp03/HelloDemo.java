package cn.osxm.ssmi.chp03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml", HelloDemo.class);
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        helloService.sayHello();
    }
}
