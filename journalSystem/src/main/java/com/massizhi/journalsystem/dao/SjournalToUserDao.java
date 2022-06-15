package com.massizhi.journalsystem.dao;

import com.massizhi.journalsystem.entity.SjournalToUser;

import java.util.List;

public interface SjournalToUserDao {

    int insertLink(SjournalToUser contribute);

    int deleteReview(Integer userId, Integer submitId);

    int deleteSJ(Integer submitId);

    List<SjournalToUser> queryLink();

    SjournalToUser getContributor(Integer submitId);

    List<SjournalToUser> getReviewer(Integer submitId);

    List<SjournalToUser> getContributedJournal(Integer userId);

    List<SjournalToUser> getReviewedJournal(Integer userId);
}
