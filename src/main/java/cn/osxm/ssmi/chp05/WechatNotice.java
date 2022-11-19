package cn.osxm.ssmi.chp05;

import org.springframework.stereotype.Service;

@Service
public class WechatNotice implements Notice {
    @Override
    public void send() {
        System.out.println("WechatNotice");
    }
}
