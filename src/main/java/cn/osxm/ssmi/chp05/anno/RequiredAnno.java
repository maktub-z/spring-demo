package cn.osxm.ssmi.chp05.anno;

import cn.osxm.ssmi.com.Foo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Required;


public class RequiredAnno {             //定义一个使用@Required注解的类
    private Foo foo;                    //属性
    @Required                           //对依赖对象是否有配置进行检查
    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
