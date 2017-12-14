package com.yoyiyi.springboot.yo1.yi5;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 类名：HelloServiceProperties
 * 描述：TODO
 * 时间：2017/12/14 18:33
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */

@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String MSG = "world";

    private String msg = MSG;

    public static String getMSG() {
        return MSG;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
