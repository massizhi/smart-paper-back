package com.massizhi.journalsystem.controller;

import com.massizhi.journalsystem.config.RemovePassword;
import com.massizhi.journalsystem.entity.Editor;
import com.massizhi.journalsystem.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/editor")
@CrossOrigin
public class EditorController {
    @Autowired
    private EditorService editorService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private Map<String, Object> login(String email, String password) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Editor editor = editorService.getEditorByEmailAndPwd(email, password);
        if (editor != null) {
            editor.setPassword(null);
            modelMap.put("editor", editor);
        } else {
            modelMap.put("editor", "登录失败，账号或密码不正确");
        }
        return modelMap;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    private Map<String, Object> register(@RequestBody Editor editor) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = editorService.insertEditor(editor);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "注册失败，请检查必填项");
        }
        return modelMap;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    private Map<String, Object> logout(Integer editorId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = editorService.deleteEditor(editorId);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "注销账号失败");
        }
        return modelMap;
    }

    @RequestMapping(value = "/changeidentity", method = RequestMethod.POST)
    private Map<String, Object> changeIdentity(Integer editorId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = editorService.changeIdentity(editorId);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "身份转化失败");
        }
        return modelMap;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private Map<String, Object> updateInfo(@RequestBody Editor editor) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        editor.setIdentity(null);
        editor.setPassword(null);
        int result = editorService.updateInfo(editor);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "editor信息更新失败");
        }
        return modelMap;
    }

    @RequestMapping(value = "/changepassword", method = RequestMethod.POST)
    private Map<String, Object> changePwd(String email, String oldPwd, String newPwd) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = editorService.changePwd(email, oldPwd, newPwd);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "editor密码修改失败，email或原密码不正确");
        }
        return modelMap;
    }

    @RequestMapping(value = "/forgetpassword", method = RequestMethod.POST)
    private Map<String, Object> forgetPwd(String email, String newPwd) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = editorService.forgetPwd(email, newPwd);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "editor密码修改失败，email不正确");
        }
        return modelMap;
    }

    @RequestMapping(value = "/geteditorbyid", method = RequestMethod.GET)
    private Map<String, Object> getEditorById(Integer editorId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Editor editor = editorService.getEditorById(editorId);
        editor.setPassword(null);
        modelMap.put("editor", editor);
        return modelMap;
    }

    @RequestMapping(value = "/geteditors", method = RequestMethod.GET)
    private Map<String, Object> getEditors() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("editorList", RemovePassword.editorRP(editorService.getEditors()));
        return modelMap;
    }
}
