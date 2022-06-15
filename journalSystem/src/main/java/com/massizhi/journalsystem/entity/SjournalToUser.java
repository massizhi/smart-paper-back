package com.massizhi.journalsystem.entity;

public class SjournalToUser {
    // 自增
    private Integer linkId;
    // 投稿人/审稿人id
    private Integer userId;
    // 已投稿件id
    private Integer submitId;
    // 0是投稿关系； 1是期刊与第一审稿人; n是期刊与第n审稿人
    private Integer relationship;

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSubmitId() {
        return submitId;
    }

    public void setSubmitId(Integer submitId) {
        this.submitId = submitId;
    }

    public Integer getRelationship() {
        return relationship;
    }

    public void setRelationship(Integer relationship) {
        this.relationship = relationship;
    }
}
