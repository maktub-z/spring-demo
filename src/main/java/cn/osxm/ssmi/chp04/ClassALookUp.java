package cn.osxm.ssmi.chp04;

import org.springframework.beans.factory.annotation.Lookup;

public class ClassALookUp {
    @Lookup
    public ClassB getClassB() {
        return null;
    }
}
