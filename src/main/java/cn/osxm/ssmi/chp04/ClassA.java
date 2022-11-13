package cn.osxm.ssmi.chp04;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ClassA implements ApplicationContextAware {
    private  ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ClassB getBeanB() {
        return (ClassB) applicationContext.getBean("beanB");
    }
}
