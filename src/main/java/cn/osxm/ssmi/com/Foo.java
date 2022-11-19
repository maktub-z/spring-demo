package cn.osxm.ssmi.com;

import cn.osxm.ssmi.chp04.model.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Foo {
    @Bean(name = "barBean", value = "barBean")
    public Bar myInifBar() {
        return new Bar();
    }

    @Description(value = "这是一个通过@Bean注解方法产生的bean")//给Bean添加说明
    @Bean(name = "userByMethod", value = "userByMethod", initMethod = "userInit", destroyMethod = "userDestroy")
    @Scope("singleton")
    public User user(Foo foo) {
        System.out.println("@Bean 注解方法的参数是依赖注入对象：" + foo);
        return new User("Oscar");
    }

    @Bean       //组件注解
    //如果
    @Primary
    public User secondUser() {
        return new User("second");
    }

}
