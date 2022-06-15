package com.massizhi.journalsystem.entity;

import java.sql.Date;
import java.time.LocalDate;

public class Journal {
    // 自增
    private Integer journalId;
    // 例：2022年33期
    private String name;
    // 介绍
    private String introduction;
    // 版面费（默认值：0）
    private Integer pageFee;
    // 出版文章数
    private Integer publishNumber;
    // 收到投稿数
    private Integer receiveNumber;
    // 开始时间
    private LocalDate startDate;
    // 出版时间
    private LocalDate publishDate;
    // 投稿开时
    private LocalDate submitStartDate;
    // 投稿结时
    private LocalDate submitEndDate;
    // 分配开时
    private LocalDate distributeStartDate;
    // 分配结时
    private LocalDate distributeEndDate;
    // 审稿开时
    private LocalDate reviewStartDate;
    // 审稿结时
    private LocalDate reviewEndDate;

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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getPageFee() {
        return pageFee;
    }

    public void setPageFee(Integer pageFee) {
        this.pageFee = pageFee;
    }

    public Integer getPublishNumber() {
        return publishNumber;
    }

    public void setPublishNumber(Integer publishNumber) {
        this.publishNumber = publishNumber;
    }

    public Integer getReceiveNumber() {
        return receiveNumber;
    }

    public void setReceiveNumber(Integer receiveNumber) {
        this.receiveNumber = receiveNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public LocalDate getSubmitStartDate() {
        return submitStartDate;
    }

    public void setSubmitStartDate(LocalDate submitStartDate) {
        this.submitStartDate = submitStartDate;
    }

    public LocalDate getSubmitEndDate() {
        return submitEndDate;
    }

    public void setSubmitEndDate(LocalDate submitEndDate) {
        this.submitEndDate = submitEndDate;
    }

    public LocalDate getDistributeStartDate() {
        return distributeStartDate;
    }

    public void setDistributeStartDate(LocalDate distributeStartDate) {
        this.distributeStartDate = distributeStartDate;
    }

    public LocalDate getDistributeEndDate() {
        return distributeEndDate;
    }

    public void setDistributeEndDate(LocalDate distributeEndDate) {
        this.distributeEndDate = distributeEndDate;
    }

    public LocalDate getReviewStartDate() {
        return reviewStartDate;
    }

    public void setReviewStartDate(LocalDate reviewStartDate) {
        this.reviewStartDate = reviewStartDate;
    }

    public LocalDate getReviewEndDate() {
        return reviewEndDate;
    }

    public void setReviewEndDate(LocalDate reviewEndDate) {
        this.reviewEndDate = reviewEndDate;
    }
}
