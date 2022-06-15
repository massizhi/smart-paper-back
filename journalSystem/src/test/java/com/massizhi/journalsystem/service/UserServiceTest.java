package com.massizhi.journalsystem.service;

import com.massizhi.journalsystem.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceTest {
//    @Autowired
//    private UserService userService;
//
//    @Test
//    void getUserByEmailAndPwd() {
//        System.out.println(userService.getUserByEmailAndPwd("123456@qq.com", "abcdef").getFirstName());
//    }
//
//    @Test
//    void insertUser() {
//
//    }
//
//    @Test
//    void deleteUser() {
//    }
//
//    @Test
//    void toCR() {
//        userService.toCR(3);
//    }
//
//    @Test
//    void toContributor() {
//        userService.toContributor(3);
//    }
//
//    @Test
//    void toReviewer() {
//        userService.toReviewer(3);
//    }
//
//    @Test
//    void updateInfo() {
//        User user = new User();
//        user.setUserId(3);
//        user.setIntroduction("hello world!");
//        userService.updateInfo(user);
//    }
//
//    @Test
//    void changePwd() {
//        System.out.println(userService.changePwd("123456@qq.com", "abcdef", "123456"));
//    }
//
//    @Test
//    void forgetPwd() {
//        userService.forgetPwd("massizhi@163.com","123456");
//    }
//
//    @Test
//    void getUsers() {
//        List<User> users = userService.getUsers();
//        for(User user: users){
//            System.out.println(user.getFirstName());
//        }
//    }
//
//    @Test
//    void getContributors() {
//        List<User> users = userService.getContributors();
//        for(User user: users){
//            System.out.println(user.getFirstName());
//        }
//    }
//
//    @Test
//    void getReviewers() {
//        List<User> users = userService.getReviewers();
//        for(User user: users){
//            System.out.println(user.getFirstName());
//        }
//    }
}