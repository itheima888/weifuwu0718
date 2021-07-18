package com.itheima.controller;

import com.itheima.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @auther: ${黄}
 * @date: 2021/7/11 10:57
 */
@RestController
@RequestMapping("/feign")
public class FeignConsumerController {

    @Autowired(required = false)
    private UserFeign userFeign;

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable(value = "id") Integer id){

        String byId = userFeign.findById(id);
        return byId;
    }
}
