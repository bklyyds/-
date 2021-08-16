package com.sdxb.blog.blog.entity;

import lombok.Data;

/**
 * @Author 浮生光
 * @create 2021/8/15 21:26
 */
@Data
public class User {
    private int id;
    private String name;
    private String password;
    private String token;
    private String headpic;
    public User() {
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
