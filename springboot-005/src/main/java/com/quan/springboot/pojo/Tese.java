package com.quan.springboot.pojo;

public class Tese {
    public static void main(String[] args) {

        User build = User.builder().addHobby("篮球").addHobby("音乐").build();
        System.out.println(build);

    }
}
