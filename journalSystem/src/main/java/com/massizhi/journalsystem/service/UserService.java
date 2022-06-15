package com.massizhi.journalsystem.service;

import com.massizhi.journalsystem.entity.User;

import java.util.List;

public interface UserService {
    // 登录
    User getUserByEmailAndPwd(String email,String password);
    // 注册
    int insertUser(User user);
    // 注销账号
    int deleteUser(Integer userId);
    // 审/投 -> 审+投
    int toCR(Integer userId);
    // 审/投 -> 投
    int toContributor(Integer userId);
    // 审/投 -> 审
    int toReviewer(Integer userId);
    // 修改用户信息
    int updateInfo(User user);
    // 修改密码
    int changePwd(String email, String oldPwd, String newPwd);
    // 忘记密码
    int forgetPwd(String email, String newPwd);
    // 通过ID得到用户
    User getUserById(Integer userId);
    // 查询所有人
    List<User> getUsers();
    // 查询所有投稿人(包含：投稿+审稿)
    List<User> getContributors();
    // 查询所有审稿人(包含：投稿+审稿)
    List<User> getReviewers();
}
