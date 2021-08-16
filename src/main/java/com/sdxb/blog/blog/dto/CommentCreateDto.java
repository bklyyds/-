package com.sdxb.blog.blog.dto;

import lombok.Data;

/**
 * @Author 浮生光
 * @create 2021/8/15 22:03
 */
@Data
public class CommentCreateDto {
    private int parent_id;
    private int type;
    private String content;
}
