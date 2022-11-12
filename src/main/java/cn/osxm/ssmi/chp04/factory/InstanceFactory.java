package cn.osxm.ssmi.chp04.factory;

import cn.osxm.ssmi.chp04.model.Bar;
import cn.osxm.ssmi.chp04.model.Foo;

public class InstanceFactory {
    public static Foo foo = new Foo();
    public static Bar bar = new Bar();

    public Foo getFooInstance() {
        return foo;
    }

    public Bar getBarInstance() {
        return bar;
    }
}
