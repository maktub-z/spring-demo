package cn.osxm.ssmi.chp04.service;

public class StaticFactoryService {
    public static StaticFactoryService service = new StaticFactoryService();

    public static StaticFactoryService getInstance() {
        return service;
    }
}
