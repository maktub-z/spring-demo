package cn.osxm.ssmi.com;

import lombok.Data;

@Data
public class User {
    private String name;
    private User user;
    private Integer age;

    public User(String name) {
        this.name = name;
    }

    private void userInit() {
        System.out.println("初始化");
    }

    private void userDestroy() {
        System.out.println("销毁");
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
