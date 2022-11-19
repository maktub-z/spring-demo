package cn.osxm.ssmi.chp05;

import org.springframework.stereotype.Service;

@Service                    //组件注册
public class MailNotice implements Notice {
    @Override
    public void send() {
        System.out.println("mainNotice");
    }
}
