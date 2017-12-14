package com.yoyiyi.springboot.yo1.yi3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 类名：UpSetting
 * 描述：TODO
 * 时间：2017/12/14 17:29
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */


@Component
@ConfigurationProperties(prefix = "up")
@PropertySource("classpath:up.properties")
public class UpSetting {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
