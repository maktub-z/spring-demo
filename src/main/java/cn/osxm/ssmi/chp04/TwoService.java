package cn.osxm.ssmi.chp04;

public class TwoService {
    private ThirdService thirdService;
    private FourService fourService;

    public TwoService(ThirdService thirdService, FourService fourService) {
        this.thirdService = thirdService;
        this.fourService = fourService;
    }
}
