package com.itheima.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @auther: ${黄}
 * @date: 2021/7/11 0:03
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/find/{id}")
    public String findById(@PathVariable(value = "id") Integer id){

        String url = "http://localhost:9091/api/user/findById/" + id;
        String forObject = restTemplate.getForObject(url, String.class);
        return forObject;
    }

    @GetMapping("/findName/{username}")
    public String findName(@PathVariable(value = "username") String username){
        String u = "http://localhost:9091/api/user/findName/"+username;
        String forObject = restTemplate.getForObject(u, String.class);
        return forObject;
    }

    @PutMapping("/save/{user}")
    public String findName(@PathVariable(value = "user")User user){
        String u = "http://localhost:9091/api/user/save/"+user;
        String forObject = restTemplate.getForObject(u, String.class);
        return forObject;
    }


}
