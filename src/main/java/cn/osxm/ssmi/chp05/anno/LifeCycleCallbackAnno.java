package cn.osxm.ssmi.chp05.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleCallbackAnno {
    @PostConstruct
    public void startAnno() {

    }

    @PreDestroy
    public void endAnno() {

    }
}
