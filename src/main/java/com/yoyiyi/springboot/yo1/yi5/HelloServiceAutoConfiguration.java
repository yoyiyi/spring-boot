package com.yoyiyi.springboot.yo1.yi5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类名：HelloServiceAutoConfiguration
 * 描述：TODO
 * 时间：2017/12/14 18:37
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */

@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
@ConditionalOnClass(HelloService.class)//（某个class位于类路径上，才会实例化一个Bean）
@ConditionalOnProperty(prefix = "hello", value = "enabled", matchIfMissing = true)
public class HelloServiceAutoConfiguration {

    @Autowired
    private HelloServiceProperties helloServiceProperties;


    @Bean
    @ConditionalOnMissingBean(HelloService.class)//（仅仅在当前上下文中存在某个对象时，才会实例化一个Bean）
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }


}
