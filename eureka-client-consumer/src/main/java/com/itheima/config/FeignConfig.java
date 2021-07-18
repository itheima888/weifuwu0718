package com.itheima.config;




import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @auther: ${黄}
 * @date: 2021/7/11 11:18
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feginLogger(){
        return Logger.Level.FULL;
    }

}
