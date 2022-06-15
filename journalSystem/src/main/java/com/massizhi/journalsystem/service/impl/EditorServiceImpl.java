package com.massizhi.journalsystem.service.impl;

import com.massizhi.journalsystem.dao.EditorDao;
import com.massizhi.journalsystem.entity.Editor;
import com.massizhi.journalsystem.entity.Editor;
import com.massizhi.journalsystem.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EditorServiceImpl implements EditorService {
    @Autowired
    private EditorDao editorDao;

    @Override
    public Editor getEditorByEmailAndPwd(String email, String password) {
        return editorDao.getEditorByEmailAndPwd(email, password);
    }

    @Override
    @Transactional
    public int insertEditor(Editor editor) {
        try {
            int effectedNum = editorDao.insertEditor(editor);
            if (effectedNum > 0) {
                return effectedNum;
            } else {
                throw new RuntimeException("insertEditor失败");
            }
        } catch (Exception e) {
            throw new RuntimeException("insertEditor出现如下异常:" + e.toString());
        }
    }

    @Override
    @Transactional
    public int deleteEditor(Integer editorId) {
        if (editorId != null && editorId != 0) {
            try {
                int effectedNum = editorDao.deleteEditor(editorId);
                if (effectedNum > 0) {
                    return effectedNum;
                } else {
                    throw new RuntimeException("ID已得到，但deleteEditor失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("deleteEditor出现如下异常:" + e.toString());
            }
        } else {
            throw new RuntimeException("deleteEditor失败，ID为null/0");
        }
    }

    @Override
    @Transactional
    public int changeIdentity(Integer editorId) {
        if (editorId != null && editorId != 0) {
            try {
                int effectedNum = editorDao.changeIdentity(editorId);
                if (effectedNum > 0) {
                    return effectedNum;
                } else {
                    throw new RuntimeException("ID已得到，但changeIdentity失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("changeIdentity出现如下异常:" + e.toString());
            }
        } else {
            throw new RuntimeException("changeIdentity失败，ID为null/0");
        }
    }

    @Override
    @Transactional
    public int updateInfo(Editor editor) {
        if (editor.getEditorId() != null) {
            try {
                int effectedNum = editorDao.updateInfo(editor);
                if (effectedNum > 0) {
                    return effectedNum;
                } else {
                    throw new RuntimeException("ID已得到，但updateInfo失败");
                }
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
                Editor editor = editorDao.getEditorByEmailAndPwd(email, oldPwd);
                if (editor != null) {
                    editor.setPassword(newPwd);
                    effectedNum = editorDao.updateInfo(editor);
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
                Editor editor = editorDao.getEditorByEmail(email);
                if (editor != null) {
                    editor.setPassword(newPwd);
                    effectedNum = editorDao.updateInfo(editor);
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
    public Editor getEditorById(Integer editorId) {
        return editorDao.getEditorById(editorId);
    }

    @Override
    public List<Editor> getEditors() {
        return editorDao.queryEditor();
    }
}
