package com.massizhi.journalsystem.entity;

public class UserSubmit {
    private SubmitJournal submitJournal;

    private Integer userId;

    public SubmitJournal getSubmitJournal() {
        return submitJournal;
    }

    public void setSubmitJournal(SubmitJournal submitJournal) {
        this.submitJournal = submitJournal;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
