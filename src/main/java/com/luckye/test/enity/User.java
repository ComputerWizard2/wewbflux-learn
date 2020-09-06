package com.luckye.test.enity;

import lombok.Data;


@Data
public class User {

    private String name;
    private  String gender;
    private  String age;

    public User(String name, String gender, String age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
