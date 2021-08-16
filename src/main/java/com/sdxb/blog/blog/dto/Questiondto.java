package com.sdxb.blog.blog.dto;

import com.sdxb.blog.blog.entity.User;
import lombok.Data;

/**
 * @Author 浮生光
 * @create 2021/8/15 21:43
 */
@Data
public class Questiondto {
    private int id;
    private String title;
    private String description;
    private int createid;
    private int comment_count;
    private int view_count;
    private int like_count;
    private String tag;
    private long createtime;
    private User user;
}
