package cn.com.feiqun.obj;

import lombok.Data;

import javax.persistence.Id;

/**
 * @author feiqun
 * @date 2019/4/29 15:14
 * @desc
 */
@Data
public class User {
    @Id
    public String id;

    public String name;
    public Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
