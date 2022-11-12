package cn.osxm.ssmi.chp04;

import cn.osxm.ssmi.chp04.model.Foo;
import cn.osxm.ssmi.chp04.model.OuterClass;
import cn.osxm.ssmi.chp04.callback.ImplCallbackService;
import cn.osxm.ssmi.chp04.service.StaticFactoryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Chp04Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml", Chp04Demo.class);
        OuterClass.InnerClass innerClass = (OuterClass.InnerClass)applicationContext.getBean("innerObject");
        innerClass.innerMethod();

        StaticFactoryService staticFactoryService = applicationContext.getBean(StaticFactoryService.class);
        System.out.println(staticFactoryService);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);

        ImplCallbackService implCallbackService = applicationContext.getBean(ImplCallbackService.class);
        System.out.println(implCallbackService);

        UseLazyService useLazyService = applicationContext.getBean(UseLazyService.class);
        System.out.println(useLazyService);

//        ParentBean parentBean = applicationContext.getBean(ParentBean.class);
        ChildBean childBean = applicationContext.getBean(ChildBean.class);
//        System.out.println(parentBean);
        System.out.println(childBean);

        SimpleTypeDepService simpleTypeDepService = applicationContext.getBean(SimpleTypeDepService.class);
        simpleTypeDepService.fooBar();

        applicationContext.close();
    }
}
