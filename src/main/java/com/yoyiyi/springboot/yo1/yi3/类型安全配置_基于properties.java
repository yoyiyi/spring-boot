package com.yoyiyi.springboot.yo1.yi3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名：类型安全配置
 * 描述：TODO
 * 时间：2017/12/14 17:25
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@RestController
public class 类型安全配置_基于properties {
    @Autowired
    private UpSetting upSetting;

    @RequestMapping("/yo1/yi4")
    public String fun1(){

        return "up名字:" + upSetting.getName() + "----" + "up年龄:" + upSetting.getAge();
    }

}
