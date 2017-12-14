package com.yoyiyi.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
       // SpringApplication.run(Application.class, args);

        //2.设置banner
        SpringApplication application = new SpringApplication(Application.class);
        application.setBannerMode(Banner.Mode.CONSOLE);
        application.run(args);
    }


}
