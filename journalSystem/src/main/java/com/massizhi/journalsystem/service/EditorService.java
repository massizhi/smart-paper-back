package com.massizhi.journalsystem.service;

import com.massizhi.journalsystem.entity.Editor;

import java.util.List;

public interface EditorService {
    // 登录
    Editor getEditorByEmailAndPwd(String email, String password);
    // 注册
    int insertEditor(Editor editor);
    // 注销账号
    int deleteEditor(Integer editorId);
    // 普通编辑 -> 主编 / 主编 -> 普通编辑
    int changeIdentity(Integer editorId);
    // 修改编辑信息
    int updateInfo(Editor editor);
    // 修改密码
    int changePwd(String email, String oldPwd, String newPwd);
    // 忘记密码
    int forgetPwd(String email, String newPwd);
    // 通过ID得到编辑
    Editor getEditorById(Integer editorId);
    // 查询所有编辑
    List<Editor> getEditors();
}
