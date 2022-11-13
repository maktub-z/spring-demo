package cn.osxm.ssmi.chp04;

import lombok.Data;

@Data
public class OutBeanClass {
    private InnerBeanClass innerBeanClass;

    public OutBeanClass(InnerBeanClass innerBeanClass) {
        this.innerBeanClass = innerBeanClass;
    }
}
