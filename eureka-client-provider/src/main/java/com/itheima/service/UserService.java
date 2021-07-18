package com.itheima.service;

import com.itheima.pojo.User;

/**
 * @ClassName UserService
 * @Description
 * @Author 传智播客
 * @Date 10:27 2020/8/25
 * @Version 2.1
 **/
public interface UserService {

    User findById(Integer id);

    User findName(String username);

    void save(User user);
}
