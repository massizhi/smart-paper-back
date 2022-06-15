package com.massizhi.journalsystem.service;

import com.massizhi.journalsystem.entity.SjournalToUser;
import com.massizhi.journalsystem.entity.SubmitJournal;
import com.massizhi.journalsystem.entity.SubmitJournalPro;
import com.massizhi.journalsystem.entity.User;

import java.util.List;

public interface SubmitJournalService {
    // 投稿
    int submitJournal(Integer userId, SubmitJournal submitJournal);
    // 审稿
    int reviewJournal(Integer userId, Integer submitId);
    // 撤回审稿关系
    int deleteReview(Integer userId, Integer submitId);
    // 删除稿件
    int deleteSubmitJournal(Integer submitId);
    // 更新投稿信息
    int updateInfo(SubmitJournal submitJournal);
    // 所有稿件
    List<SubmitJournalPro> getSubmitJournal();
    // 根据状态（allocating/reviewing/(major revision/minor revision/accept/reject)）查询所有稿件
    // 展示时选择所有accept的稿件即可
    List<SubmitJournalPro> getSubmitJournalByState(String state);
    // 根据状态+（论文名称/作者/关键词）查询所有稿件
    // 展示时选择所有accept的稿件即可
    List<SubmitJournalPro> searchJournal(String state, String key);
    // ID查询投稿
    SubmitJournal getSubmitJournalById(Integer submitId);
    // 查询某期期刊所有投稿
    List<SubmitJournal> getSubmitJournalByJournalId(Integer journalId);
    // 根据状态查询某期期刊投稿
    List<SubmitJournal> getSubmitJournalByJournalIdAndState(Integer journalId, String state);
    // 查询所有投/审稿关系
    List<SjournalToUser> getLink();
    // 查询某稿件的投稿人信息
    User getContributor(Integer submitId);
    // 查询某稿件的审稿人信息
    List<User> getReviewer(Integer submitId);
    // 查询某人的所有投稿
    List<SubmitJournal> getContributedJournal(Integer userId);
    // 查询某人的所有审稿
    List<SubmitJournal> getReviewedJournal(Integer userId);
}
