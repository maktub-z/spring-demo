package cn.osxm.ssmi.chp04;

import lombok.Data;


public class SimpleTypePropertyDepService {
    private String sBar;
    private String iFoo;

    public String getsBar() {
        return sBar;
    }

    public void setsBar(String sBar) {
        this.sBar = sBar;
    }

    public String getiFoo() {
        return iFoo;
    }

    public void setiFoo(String iFoo) {
        this.iFoo = iFoo;
    }
}
