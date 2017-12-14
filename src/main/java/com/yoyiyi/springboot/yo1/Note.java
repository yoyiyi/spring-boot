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
         *      @SpringBootApplication 主要自动组合下面三种注解
         *              @Configuration
         *              @EnableAutoConfiguration 核心
         *                          @import
         *                                  EnableAutoConfigurationImportSelector使用SpringFactoriesLoader.loadFactoryNames
         *                                  方法来扫描具有META-INF/spring.factories文件的jar包，spring-boot-autoconfigure-x.x.x.x.jar
         *                                  里就有一个spring.factories文件，这个文件中声明了有哪些要自动配置。
         *              @ComponentScan
         *
         *9. @ConditionalOnClass：该注解的参数对应的类必须存在，否则不解析该注解修饰的配置类；
         *   @ConditionalOnMissingBean：该注解表示，如果存在它修饰的类的bean，则不需要再创建这个bean；
         *   可以给该注解传入参数例如@ConditionOnMissingBean(name = "example")，这个表示如果name为“example”的bean存在，
         *   这该注解修饰的代码块不执行。
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
