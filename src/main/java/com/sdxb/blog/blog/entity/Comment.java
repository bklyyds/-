package com.sdxb.blog.blog.entity;

import lombok.Data;

/**
 * @Author 浮生光
 * @create 2021/8/15 22:02
 */
@Data
public class Comment{
    private int id;
    private int parent_id;
    private int type;
    private int commentor;
    private int like_count;
    private long createtime;
    private int commentcount;
    private String content;
}
