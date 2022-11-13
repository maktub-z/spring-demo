package cn.osxm.ssmi.chp04;

import org.springframework.context.ApplicationListener;

public class UserEventListener implements ApplicationListener<UserRegisterEvent> {
    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        System.out.println("注册成功后发送邮件：" + userRegisterEvent.getUser().getName());
    }
}
