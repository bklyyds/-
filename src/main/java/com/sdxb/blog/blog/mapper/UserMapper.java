package com.sdxb.blog.blog.mapper;

import com.sdxb.blog.blog.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author 浮生光
 * @create 2021/8/15 21:29
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(name,password,token) values (#{name},#{password},#{token})")
    void insert(User user);

    @Select("select * from user where name=#{name} and password=#{password}")
    User select(User user);

    @Select("select  * from user where token=#{token}")
    User findBytoken(String token);

    @Select("select * from user where id=#{createid}")
    User findById(int createid);
}
