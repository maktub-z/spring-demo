package cn.osxm.ssmi.chp05.anno;


import cn.osxm.ssmi.chp04.model.Bar;
import cn.osxm.ssmi.chp04.model.Foo;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

public class ResourceAnno {
    @Resource(name = "foo")
    private Foo foo;
    private Bar bar;
    @Resource
    private ApplicationContext context;

    @Resource
    public void setBar(Bar bar) {
        this.bar = bar;
    }
}
