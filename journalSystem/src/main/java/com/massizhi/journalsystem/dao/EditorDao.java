package com.massizhi.journalsystem.dao;

import com.massizhi.journalsystem.entity.Editor;

import java.util.List;

public interface EditorDao {
    // 需要设置identity值
    int insertEditor(Editor editor);

    int deleteEditor(Integer editorId);

    int changeIdentity(Integer editorId);

    int updateInfo(Editor editor);

    List<Editor> queryEditor();

    Editor getEditorByEmailAndPwd(String email,String password);

    Editor getEditorById(Integer editorId);

    Editor getEditorByEmail(String email);
}
