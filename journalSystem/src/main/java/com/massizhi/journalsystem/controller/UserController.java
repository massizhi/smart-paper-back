package com.massizhi.journalsystem.controller;

import com.massizhi.journalsystem.config.RemovePassword;
import com.massizhi.journalsystem.entity.User;
import com.massizhi.journalsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private Map<String, Object> login(String email, String password) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        User user = userService.getUserByEmailAndPwd(email, password);
        if (user != null) {
            user.setPassword(null);
            modelMap.put("user", user);
        } else {
            modelMap.put("user", "登录失败，账号或密码不正确");
        }
        return modelMap;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    private Map<String, Object> register(@RequestBody User user) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = userService.insertUser(user);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "注册失败，请检查必填项");
        }
        return modelMap;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    private Map<String, Object> logout(Integer userId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = userService.deleteUser(userId);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "注销账号失败");
        }
        return modelMap;
    }

    @RequestMapping(value = "/tocr", method = RequestMethod.POST)
    private Map<String, Object> toCR(Integer userId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = userService.toCR(userId);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "身份增加失败");
        }
        return modelMap;
    }

    @RequestMapping(value = "/tocontributor", method = RequestMethod.POST)
    private Map<String, Object> toContributor(Integer userId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = userService.toContributor(userId);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "身份减少失败");
        }
        return modelMap;
    }

    @RequestMapping(value = "/toreviewer", method = RequestMethod.POST)
    private Map<String, Object> toReviewer(Integer userId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = userService.toReviewer(userId);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "身份减少失败");
        }
        return modelMap;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private Map<String, Object> updateInfo(@RequestBody User user) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        user.setPassword(null);
        user.setIdentity(null);
        int result = userService.updateInfo(user);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "身份信息更新失败");
        }
        return modelMap;
    }

    @RequestMapping(value = "/changepassword", method = RequestMethod.POST)
    private Map<String, Object> changePwd(String email, String oldPwd, String newPwd) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = userService.changePwd(email, oldPwd, newPwd);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "密码修改失败，email或原密码不正确");
        }
        return modelMap;
    }

    @RequestMapping(value = "/forgetpassword", method = RequestMethod.POST)
    private Map<String, Object> forgetPwd(String email, String newPwd) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = userService.forgetPwd(email, newPwd);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "密码修改失败，email不正确");
        }
        return modelMap;
    }

    @RequestMapping(value = "/getuserbyid", method = RequestMethod.GET)
    private Map<String, Object> getUserById(Integer userId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        User user = userService.getUserById(userId);
        user.setPassword(null);
        modelMap.put("user", user);
        return modelMap;
    }

    @RequestMapping(value = "/getusers", method = RequestMethod.GET)
    private Map<String, Object> getUsers() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("userList", RemovePassword.userRP(userService.getUsers()));
        return modelMap;
    }

    @RequestMapping(value = "/getcontributors", method = RequestMethod.GET)
    private Map<String, Object> getContributors() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("userList", RemovePassword.userRP(userService.getContributors()));
        return modelMap;
    }

    @RequestMapping(value = "/getreviewers", method = RequestMethod.GET)
    private Map<String, Object> getReviewers() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("userList", RemovePassword.userRP(userService.getReviewers()));
        return modelMap;
    }
}
