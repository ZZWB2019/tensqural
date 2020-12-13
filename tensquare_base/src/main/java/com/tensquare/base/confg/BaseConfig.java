package com.tensquare.base.confg;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/**
 * base 工程配置类
 *
 * @author: zhouwb
 * @data: 2020/12/12
 */
@SpringBootConfiguration
public class BaseConfig {

    /**
     * 注入id生成器
     *
     * @return
     */
    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1,1);
    }
}
