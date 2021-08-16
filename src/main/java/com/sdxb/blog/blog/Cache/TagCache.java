package com.sdxb.blog.blog.Cache;

import com.sdxb.blog.blog.dto.TagDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 浮生光
 * @create 2021/8/15 22:20
 */
public class TagCache {
    public List<TagDto> gettags(){
        List<TagDto> tags=new ArrayList<>();

        TagDto language=new TagDto();
        language.setCategoryname("开发语言");
        language.setTags(Arrays.asList("java","c","c++","php","html","html5","css"));
        tags.add(language);

        TagDto tools=new TagDto();
        tools.setCategoryname("开发工具");
        tools.setTags(Arrays.asList("Spring","SpringBoot","SpringMVC"));
        tags.add(tools);

        return tags;
    }
}
