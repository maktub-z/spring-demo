package cn.osxm.ssmi.chp05.anno;

import cn.osxm.ssmi.chp04.model.Bar;
import cn.osxm.ssmi.chp04.model.Foo;
import cn.osxm.ssmi.com.Baz;

import javax.inject.Inject;
import javax.inject.Named;

public class InjectNamedAnno {
    private Foo foo;
    @Inject//构造函数注入依赖对象
    public InjectNamedAnno(Foo foo) {
        this.foo = foo;
    }

    @Inject//属性注入依赖对象
    private Bar bar;

    private Baz baz;
//    @Inject//属性Setter方法注入依赖对象
//    public void setBaz(Baz baz) {
//        this.baz = baz;
//    }
//
    @Inject
    public void setBaz(@Named("baz") Baz baz){//结合@Named注入指定名字的依赖
        this.baz = baz;
    }
}
