package com.sleepymango.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @Description: 启动类
 * @Author: sleepymango
 * @Date: 2021/3/20 15:42
 **/

@SpringBootApplication
@EnableJpaRepositories
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}