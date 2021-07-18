package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName UserDao
 * @Description
 * @Author 传智播客
 * @Date 10:26 2020/8/25
 * @Version 2.1
 **/
@Mapper
public interface UserDao {

    @Select("select * from tb_user where id = #{id}")
    User findById(Integer id);

    @Select("select * from tb_user where username = #{username}")
    User findName(String name);

    @Insert("insert into tb_user(id,username,password,name,age,sex,birthday,created,updated,note) values(#{id},#{username},#{password},#{name},#{age},#{sex},#{birthday},#{created},#{updated},#{note})")
    void save(User user);
}
