package com.sdxb.blog.blog.enums;

/**
 * @Author 浮生光
 * @create 2021/8/15 22:25
 */
public enum NotificationStatusEnum {
    UNREAD(0),
    READ(1);
    private int status;
    NotificationStatusEnum(int status){
        this.status=status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
