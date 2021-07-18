package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author 传智播客
 * @Date 10:28 2020/8/25
 * @Version 2.1
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserDao userDao;

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public User findName(String username) {
        return userDao.findName(username);
    }

    @Override
    public void save(User user) {
        userDao.save(user);}
}
