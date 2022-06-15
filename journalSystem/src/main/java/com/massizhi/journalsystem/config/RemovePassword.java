package com.massizhi.journalsystem.config;

import com.massizhi.journalsystem.entity.Editor;
import com.massizhi.journalsystem.entity.User;

import java.util.List;

public class RemovePassword {
    public static List<User> userRP(List<User> userList) {
        for (User user : userList) {
            user.setPassword(null);
        }
        return userList;
    }

    public static List<Editor> editorRP(List<Editor> editorList) {
        for (Editor editor : editorList) {
            editor.setPassword(null);
        }
        return editorList;
    }
}
