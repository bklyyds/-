package com.sdxb.blog.blog.dto;

import com.sdxb.blog.blog.entity.User;
import lombok.Data;

/**
 * @Author 浮生光
 * @create 2021/8/15 22:18
 */
@Data
public class NotificationDto {
    private int id;
    private int receiver;
    private int type;
    private long createtime;
    private int status;
    private User notifier;
    private String outercontent;
    private int questionid;
}
