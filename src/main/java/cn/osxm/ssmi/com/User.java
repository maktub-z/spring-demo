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

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
