package com.yoyiyi.springboot.yo1.yi2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名：properties注入
 * 描述：TODO
 * 时间：2017/12/14 16:30
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@RestController
public class properties注入 {

    @Value("${up.name}")
    private String name;
    @Value("${up.age}")
    private String age;


    @RequestMapping("/yo1/yi2")
    public String properties注入() {

        return "up名字:" + name + "----" + "up年龄:" + age;

    }
}
