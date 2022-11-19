package cn.osxm.ssmi.chp05.anno;

import cn.osxm.ssmi.com.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "cn.osxm.ssmi.com.anno")
public class AppConfig {
    @Bean
    public Foo foo() {
        return new Foo();
    }
}
