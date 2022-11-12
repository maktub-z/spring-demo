package cn.osxm.ssmi.chp04;

public class SimpleTypeDepService {
    private int iFoo;
    private String sBar;

    public SimpleTypeDepService(int iFoo, String sBar) {
        this.iFoo = iFoo;
        this.sBar = sBar;
    }
    public void fooBar() {
        System.out.println("iFoo = " + iFoo);
        System.out.println("sBar = " + sBar);
    }
}
