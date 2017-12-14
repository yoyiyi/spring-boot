package com.yoyiyi.springboot.yo1.yi5;

/**
 * 类名：HelloService
 * 描述：TODO
 * 时间：2017/12/14 18:35
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
public class HelloService {

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;

    public String sayHello() {
        return "Hello " + msg;

    }

    public String getMsg() {
        return msg;
    }
}
