package com.massizhi.journalsystem.dao;

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
class UserDaoTest {
//    @Autowired
//    private UserDao userDao;
//
//    @Test
//    void toCR() {
//        userDao.toCR(2);
//    }
//
//    @Test
//    void getUserById() {
//        User user = userDao.getUserById(6);
//        if (user != null) {
//            System.out.println(user.getEmail());
//            System.out.println(user.getFirstName());
//        } else {
//            System.out.println("shucuole");
//        }
//    }
//
//    @Test
//    void getUserByEmail() {
//        User user = userDao.getUserByEmail("123456@qq.com");
//        if (user != null) {
//            System.out.println(user.getEmail());
//            System.out.println(user.getFirstName());
//        } else {
//            System.out.println("shucuole");
//        }
//    }
//
//    @Test
//    void updateInfo() {
//        User user = new User();
//        user.setUserId(2);
//        user.setFirstName("xiang");
////        user.setLastName("li");
////        user.setPassword("abcdef");
////        user.setAvatarUri("www.baidu.com");
////        user.setEmail("123456@qq.com");
////        user.setIdentity(2);
//////        user.setIntroduction();
////        user.setLocation("shanghai,china");
////        user.setOrganization("ecnu");
//        userDao.updateInfo(user);
//    }
}