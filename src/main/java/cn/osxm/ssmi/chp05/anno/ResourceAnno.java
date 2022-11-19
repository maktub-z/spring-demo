package cn.osxm.ssmi.chp05.anno;


import cn.osxm.ssmi.chp04.model.Bar;
import cn.osxm.ssmi.chp04.model.Foo;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

public class ResourceAnno {
    @Resource(name = "foo")//注解使用在属性上，注入注解自定义类的对象//通过名字查找容器中对应的对象
    private Foo foo;
    private Bar bar;
    @Resource//注解使用在属性上，注入容器类的对象
    private ApplicationContext context;

    @Resource//注解使用在setter方法上，注入参数定义的对象
    public void setBar(Bar bar) {
        this.bar = bar;
    }
}
