package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserController
 * @Description
 * @Author 传智播客
 * @Date 10:28 2020/8/25
 * @Version 2.1
 **/
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${server.port}")
    private int port;

//    @RequestMapping(method = {Re})
//    @PostMapping
    // RESTful   http://localhost:8080/user/findById/1
//    @RequestMapping：不限定方法，所有的请求都可以执行   GET  POST   PUT   DELETE
    // RESTful：通过不同的请求方式获取资源    框架、设计模式都不是   它只是一种请求的风格  url：资源
    // 相比传统的请求方式：直观  url管理更方便
    @GetMapping("/findById/{id}")
    public User findById(@PathVariable(value = "id") Integer id){
        System.out.println("提供方端口：" + port);
        User user = userService.findById(id);
        return user;
    }

    @GetMapping("/findName/{username}")
    public User findName(@PathVariable(value = "username") String username){
        System.out.println("提供方端口号: "+port);
        User name1 = userService.findName(username);
        System.out.println("name1 = " + name1.toString());
        return name1;

    }

    @PutMapping("/save/{user}")
    public void save(@PathVariable(value = "user") User user){
        userService.save(user);
    }

}
