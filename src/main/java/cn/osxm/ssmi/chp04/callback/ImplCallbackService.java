package cn.osxm.ssmi.chp04.callback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ImplCallbackService implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁方法回调。。。。");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化方法回调...");
    }
}
