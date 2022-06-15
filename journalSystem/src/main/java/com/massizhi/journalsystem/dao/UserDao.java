package com.massizhi.journalsystem.dao;

import com.massizhi.journalsystem.entity.User;

import java.util.List;

public interface UserDao {

    int insertUser(User user);

    int deleteUser(Integer userId);

    int toCR(Integer userId);

    int updateInfo(User user);

    List<User> queryUser();

    User getUserByEmailAndPwd(String email,String password);

    User getUserById(Integer userId);

    User getUserByEmail(String email);
}
