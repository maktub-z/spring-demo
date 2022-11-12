package cn.osxm.ssmi.chp03;

public class HelloService {
    private String name;

    private HelloDao helloDao;
    public HelloService(String name) {
        this.name = name;
    }

    public void setHelloDao(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

    public HelloDao getHelloDao() {
        return this.helloDao;
    }

    public void sayHello() {
        System.out.println("Hello," + this.name);
        helloDao.insert();
    }
}
