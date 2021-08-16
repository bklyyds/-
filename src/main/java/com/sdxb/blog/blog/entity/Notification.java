package com.sdxb.blog.blog.entity;

import lombok.Data;

/**
 * @Author 浮生光
 * @create 2021/8/15 22:13
 */
@Data
public class Notification {
    private int id;
    private int notifier;
    private int receiver;
    private int outerid;
    private int type;
    private long createtime;
    private int status;
}
