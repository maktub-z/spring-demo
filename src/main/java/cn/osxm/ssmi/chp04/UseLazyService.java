package cn.osxm.ssmi.chp04;

import cn.osxm.ssmi.chp04.callback.CfgCallbackService;
import lombok.Data;

@Data
public class UseLazyService {
    public CfgCallbackService lazyInitService;

    public void UseLazyService(CfgCallbackService lazyInitService) {
        this.lazyInitService = lazyInitService;
    }
}
