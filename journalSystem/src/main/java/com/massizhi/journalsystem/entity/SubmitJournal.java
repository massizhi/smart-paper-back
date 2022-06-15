package com.massizhi.journalsystem.entity;

import java.sql.Timestamp;

public class SubmitJournal {
    // 自增
    private Integer submitId;
    // 期刊id
    private Integer journalId;
    // 论文名称
    private String name;
    // 提交时间（数据库自动填写）
    private Timestamp submitTime;
    // 稿件状态
    private String state;
    // 摘要
    private String journalAbstract;
    // 关键词
    private String keyWord;
    // 存储文件名
    private String fileName;
    // 存放路径
    private String filePath;
    // 作者们
    private String authors;
    // 通讯作者
    private String correspondingAuthor;
    // 通讯方式
    private String correspondingEmail;

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getCorrespondingEmail() {
        return correspondingEmail;
    }

    public void setCorrespondingEmail(String correspondingEmail) {
        this.correspondingEmail = correspondingEmail;
    }

    public Integer getSubmitId() {
        return submitId;
    }

    public void setSubmitId(Integer submitId) {
        this.submitId = submitId;
    }

    public Integer getJournalId() {
        return journalId;
    }

    public void setJournalId(Integer journalId) {
        this.journalId = journalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Timestamp submitTime) {
        this.submitTime = submitTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getJournalAbstract() {
        return journalAbstract;
    }

    public void setJournalAbstract(String journalAbstract) {
        this.journalAbstract = journalAbstract;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getCorrespondingAuthor() {
        return correspondingAuthor;
    }

    public void setCorrespondingAuthor(String correspondingAuthor) {
        this.correspondingAuthor = correspondingAuthor;
    }
}
