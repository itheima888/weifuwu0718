package com.itheima;

/**
 * @Description
 * @auther: ${黄}
 * @date: 2021/7/18 10:55
 */

public class Student {
    private String name;
    private Integer age;
public Student(){}

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
