package cn.osxm.ssmi.chp04;

import cn.osxm.ssmi.com.User;
import org.springframework.context.ApplicationEvent;

public class UserRegisterEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;
    private User user;
    public UserRegisterEvent(Object source, User user) {
        super(source);
        this.user = user;
    }
    public User getUser() {
        return user;
    }
}
