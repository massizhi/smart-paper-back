package com.massizhi.journalsystem.service.impl;

import com.massizhi.journalsystem.dao.UserDao;
import com.massizhi.journalsystem.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements com.massizhi.journalsystem.service.UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByEmailAndPwd(String email, String password) {
        return userDao.getUserByEmailAndPwd(email, password);
    }

    @Override
    @Transactional
    public int insertUser(User user) {
        try {
            return userDao.insertUser(user);
        } catch (Exception e) {
            throw new RuntimeException("insertUser出现如下异常:" + e.toString());
        }
    }

    @Override
    @Transactional
    public int deleteUser(Integer userId) {
        if (userId != null && userId != 0) {
            try {
                return userDao.deleteUser(userId);
            } catch (Exception e) {
                throw new RuntimeException("deleteUser出现如下异常:" + e.toString());
            }
        } else {
            throw new RuntimeException("deleteUser失败，ID为null/0");
        }
    }

    @Override
    @Transactional
    public int toCR(Integer userId) {
        if (userId != null && userId != 0) {
            try {
                User user = new User();
                user.setUserId(userId);
                user.setIdentity(3);
                return userDao.updateInfo(user);
            } catch (Exception e) {
                throw new RuntimeException("toCR出现如下异常:" + e.toString());
            }
        } else {
            throw new RuntimeException("toCR失败，ID为null/0");
        }
    }

    @Override
    @Transactional
    public int toContributor(Integer userId) {
        if (userId != null && userId != 0) {
            try {
                User user = new User();
                user.setUserId(userId);
                user.setIdentity(1);
                return userDao.updateInfo(user);
            } catch (Exception e) {
                throw new RuntimeException("toContributor出现如下异常:" + e.toString());
            }
        } else {
            throw new RuntimeException("toContributor失败，ID为null/0");
        }
    }

    @Override
    @Transactional
    public int toReviewer(Integer userId) {
        if (userId != null && userId != 0) {
            try {
                User user = new User();
                user.setUserId(userId);
                user.setIdentity(2);
                return userDao.updateInfo(user);
            } catch (Exception e) {
                throw new RuntimeException("toReviewer出现如下异常:" + e.toString());
            }
        } else {
            throw new RuntimeException("toReviewer失败，ID为null/0");
        }
    }

    @Override
    @Transactional
    public int updateInfo(User user) {
        if (user.getUserId() != null) {
            try {
                return userDao.updateInfo(user);
            } catch (Exception e) {
                throw new RuntimeException("updateInfo出现如下异常:" + e.toString());
            }
        } else {
            throw new RuntimeException("updateInfo失败，ID为空");
        }
    }

    @Override
    @Transactional
    public int changePwd(String email, String oldPwd, String newPwd) {
        if (email != null && !email.equals("") && oldPwd != null
                && !oldPwd.equals("") && newPwd != null && !newPwd.equals("")) {
            try {
                int effectedNum = 0;
                User user = userDao.getUserByEmailAndPwd(email, oldPwd);
                if (user != null) {
                    user.setPassword(newPwd);
                    effectedNum = userDao.updateInfo(user);
                }
                return effectedNum;
            } catch (Exception e) {
                throw new RuntimeException("changePwd出现如下异常:" + e.toString());
            }
        } else {
            throw new RuntimeException("changePwd失败，email或oldPwd或newPwd为null/'' ");
        }
    }

    @Override
    @Transactional
    public int forgetPwd(String email, String newPwd) {
        if (email != null && !email.equals("") && newPwd != null && !newPwd.equals("")) {
            try {
                int effectedNum = 0;
                User user = userDao.getUserByEmail(email);
                if (user != null) {
                    user.setPassword(newPwd);
                    effectedNum = userDao.updateInfo(user);
                }
                return effectedNum;
            } catch (Exception e) {
                throw new RuntimeException("forgetPwd出现如下异常:" + e.toString());
            }
        } else {
            throw new RuntimeException("forgetPwd失败，email或newPwd为null/'' ");
        }
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public List<User> getUsers() {
        return userDao.queryUser();
    }

    @Override
    public List<User> getContributors() {
        List<User> users = userDao.queryUser();
        List<User> contributors = new ArrayList<>();
        for (User user : users) {
            if (user.getIdentity() != 2)
                contributors.add(user);
        }
        return contributors;
    }

    @Override
    public List<User> getReviewers() {
        List<User> users = userDao.queryUser();
        List<User> reviewers = new ArrayList<>();
        for (User user : users) {
            if (user.getIdentity() != 1)
                reviewers.add(user);
        }
        return reviewers;
    }
}
