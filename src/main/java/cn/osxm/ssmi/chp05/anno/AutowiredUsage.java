package cn.osxm.ssmi.chp05.anno;

import cn.osxm.ssmi.chp04.model.Bar;
import cn.osxm.ssmi.chp05.Notice;
import cn.osxm.ssmi.com.Baz;
import cn.osxm.ssmi.com.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Set;

public class AutowiredUsage {
    private Foo foo;
    private Bar bar;
    //使用在属性定义上
    @Autowired
    private Baz baz;
    @Autowired//自动装载数组类型的依赖
    private Baz[] bazs;
    @Autowired//自动装载集合类型的依赖
    private Set<Baz> bazSet;
    @Autowired//自动装载键值对类型的依赖
    private Map<String, Baz> bazMap;

    @Autowired                          //自动装载注解使用在构造器中
    public AutowiredUsage(Foo foo) {
        this.foo = foo;
    }

    @Autowired                          //在属性的 Setter 方法中使用
    public void setBar(Bar bar) {
        this.bar = bar;
    }

    @Autowired                          //使用在一般方法中
    public void myInitBar(Bar bar) {
        this.bar = bar;
    }

    @Autowired(required = false)            //依赖检查
    public void setFoo(@Nullable Foo foo) {     //使用@Nullable检查非空
        this.foo = foo;
    }

    @Autowired
    @Qualifier("mailNotice")
    private Notice notice;
}
