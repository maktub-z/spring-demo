package cn.osxm.ssmi.chp04;

import cn.osxm.ssmi.com.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class UserService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean register(User user) {
        System.out.println("用户[" + user + "]注册成功");
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this, user));
        return true;
    }
}
