package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 自定义属性与加载
 * @author zzf
 * @date 18/4/27 14:59.
 */
@Component
public class BlogProperties {

    @Value("${com.didispace.blog.name}")
    private String name;
    @Value("${com.didispace.blog.title}")
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
