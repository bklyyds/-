package com.sdxb.blog.blog.entity;

import lombok.Data;

/**
 * @Author 浮生光
 * @create 2021/8/15 21:36
 */
@Data
public class Question {
    private int id;
    private String title;
    private String description;
    private int createid;
    private int comment_count;
    private int view_count;
    private int like_count;
    private String tag;
    private long createtime;
}
