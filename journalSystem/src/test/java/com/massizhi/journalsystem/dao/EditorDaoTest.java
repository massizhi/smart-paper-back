package com.massizhi.journalsystem.dao;

import com.massizhi.journalsystem.entity.Editor;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class EditorDaoTest {
//    @Autowired
//    private EditorDao editorDao;

//    @Test
//    void insertEditor() {
//        Editor editor = new Editor();
//        editor.setFirstName("one");
//        editor.setLastName("editor");
//        editor.setIdentity(2);
//        editor.setEmail("on@qq.com");
//        editor.setPassword("123456");
//        editor.setLocation("shanghai");
//        editor.setOrganization("ecnu");
//        editor.setIntroduction("");
//        editorDao.insertEditor(editor);
//    }

//    @Test
//    void deleteEditor() {
//        editorDao.deleteEditor(7);
//    }

//    @Test
//    void changeIdentity() {
//        editorDao.changeIdentity(2);
//    }

//    @Test
//    void updateInfo() {
//        Editor editor = new Editor();
//        editor.setEditorId(2);
//        editor.setFirstName("one");
//        editor.setLastName("editor");
////        editor.setIdentity(2);
//        editor.setEmail("one@163.com");
//        editor.setPassword("123456");
//        editor.setLocation("shanghai,china");
//        editor.setOrganization("ecnu");
//        editor.setIntroduction("wu kong");
//        editorDao.updateInfo(editor);
//    }

//    @Test
//    void queryEditor() {
//        List<Editor> editors = editorDao.queryEditor();
//        System.out.println(editors.get(0).getIntroduction());
//        System.out.println(editors.get(1).getIntroduction());
//        System.out.println(editors.size());
//    }

//    @Test
//    void getEditorById() {
//        Editor editor = editorDao.getEditorById(1);
//        System.out.println(editor.getFirstName());
//    }

//    @Test
//    void getEditorByEmail() {
//        Editor editor = editorDao.getEditorByEmail("51215902097@stu.ecnu.edu.cn");
//        System.out.println(editor.getFirstName());
//    }
//
//    @Test
//    void getEditorByEmailAndPwd() {
//        Editor editor = editorDao.getEditorByEmailAndPwd("one@163.com", "12456");
//        if (editor != null)
//            System.out.println(editor.getFirstName());
//        else
//            System.out.println("meizhaodao");
//    }
}