package com.sdxb.blog.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 浮生光
 * @create 2021/8/13 16:37
 */

@Controller
public class test {
    @GetMapping("/test")
    public String tset(){
        return "test";
    }
}
