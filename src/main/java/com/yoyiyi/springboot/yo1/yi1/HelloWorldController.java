package com.yoyiyi.springboot.yo1.yi1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名：HelloWorldController
 * 描述：TODO
 * 时间：2017/12/14 15:38
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHelloWorld() {
        return "Hello World";
    }

}
