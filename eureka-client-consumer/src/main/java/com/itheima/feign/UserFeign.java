package com.itheima.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description
 * @auther: ${黄}
 * @date: 2021/7/11 10:55
 */
@FeignClient(name = "eureka-client-provider",fallback = UserFeignFallback.class)
public interface UserFeign {
    @GetMapping("/api/user/findById/{id}")
    String findById(@PathVariable(value = "id") Integer id);
}
