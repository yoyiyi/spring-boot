package com.yoyiyi.springboot.yo1;

/**
 * 类名：Note
 * 描述：TODO
 * 时间：2017/12/14 16:10
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
public class Note {
    public void note() {
        /**
         *1.关闭特定自动配置
         *      @SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
         *
         *2.修改banner
         *        SpringApplication application = new SpringApplication(Application.class);
         *        application.setBannerMode(Banner.Mode.CONSOLE);
         *        application.run(args);
         *
         *3.修改配置
         *      server.port=8080
         *      server.context-path=/yo
         *
         *
         *4.使用xml配置
         *      @ImportResource({"classpath:some-context.xml",})
         *
         *5.properties注入
         *      @Value("${up.name}")
         *
         *6.类型安全的配置 基于properties
         *      @ConfigurationProperties(prefix = "up")
         *
         *7.Profile配置
         *          1.application-prod
         *            application-dev
         *
         *          2.在application.   设置spring.profile.active = dev
         *
         *8.spring boot 原理
         *
         *
         *
         *
         *
         *
         *
         *
         *
         *
         *
         *
         */
    }

}
