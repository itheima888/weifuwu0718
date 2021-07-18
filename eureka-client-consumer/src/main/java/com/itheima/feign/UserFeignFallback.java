package com.itheima.feign;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @auther: ${黄}
 * @date: 2021/7/11 11:08
 */
@Component
public class UserFeignFallback implements UserFeign {
    @Override
    public String findById(Integer id) {
        return "该用户异常。。。";
    }
}
