package com.sdxb.blog.blog;

import com.sdxb.blog.blog.entity.User;
import com.sdxb.blog.blog.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author 浮生光
 * @create 2021/8/13 21:10
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {
    @Resource
    UserMapper userMapper;

    @Test
    public void test(){
        User user = new User();
        user.setName("admin");
        user.setPassword("12345");
        user.setToken(UUID.randomUUID().toString());
        userMapper.insert(user);


    }
}
