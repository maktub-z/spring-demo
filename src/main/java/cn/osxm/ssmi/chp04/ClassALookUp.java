package cn.osxm.ssmi.chp04;

import org.springframework.beans.factory.annotation.Lookup;

public class ClassALookUp {
    @Lookup//注解，处理实际返回
    public ClassB getClassB() {
        return null;
    }
}
