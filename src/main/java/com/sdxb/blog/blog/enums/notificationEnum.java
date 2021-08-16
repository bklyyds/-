package com.sdxb.blog.blog.enums;

/**
 * @Author 浮生光
 * @create 2021/8/15 22:23
 */
public enum notificationEnum {
    NOTIFICATION_COMMENT(1,"回复了评论"),
    NOTIFICATION_QUESTION(2,"回复了问题");
    private int type;
    private String name;
    notificationEnum(int type, String name){
        this.type=type;
        this.name=name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
