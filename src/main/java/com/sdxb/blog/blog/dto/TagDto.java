package com.sdxb.blog.blog.dto;

import java.util.List;

/**
 * @Author 浮生光
 * @create 2021/8/15 22:21
 */
public class TagDto {
    private String categoryname;
    private List<String> tags;

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
