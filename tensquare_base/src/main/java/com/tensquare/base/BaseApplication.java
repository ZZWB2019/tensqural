package com.tensquare.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * base工程启动类
 *
 * 1. CrossOrigin 为跨域注解
 *
 * @author: zhouwb
 * @data: 2020/12/12
 */
@SpringBootApplication
@CrossOrigin
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
    }
}
