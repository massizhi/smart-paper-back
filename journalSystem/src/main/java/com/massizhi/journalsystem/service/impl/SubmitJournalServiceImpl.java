package com.massizhi.journalsystem.service.impl;

import com.massizhi.journalsystem.dao.JournalDao;
import com.massizhi.journalsystem.dao.SjournalToUserDao;
import com.massizhi.journalsystem.dao.SubmitJournalDao;
import com.massizhi.journalsystem.dao.UserDao;
import com.massizhi.journalsystem.entity.*;
import com.massizhi.journalsystem.service.SubmitJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubmitJournalServiceImpl implements SubmitJournalService {
    @Autowired
    private SubmitJournalDao submitJournalDao;
    @Autowired
    private SjournalToUserDao sjournalToUserDao;
    @Autowired
    private JournalDao journalDao;
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public int submitJournal(Integer userId, SubmitJournal submitJournal) {
        if (userId != null && userId != 0 && submitJournal != null) {
            try {
                // 增加稿件到数据库
                int effectedNum = submitJournalDao.insertSubmitJournal(submitJournal);
                // 增加投稿关系到数据库
                int submitId = submitJournalDao.getIdByName(submitJournal.getName());
                SjournalToUser sjournalToUser = new SjournalToUser();
                sjournalToUser.setSubmitId(submitId);
                sjournalToUser.setUserId(userId);
                sjournalToUser.setRelationship(0);
                effectedNum = sjournalToUserDao.insertLink(sjournalToUser);
                // 期刊投稿数+1
                Journal journal = journalDao.getJournalById(submitJournal.getJournalId());
                journal.setReceiveNumber(journal.getReceiveNumber() + 1);
                effectedNum = journalDao.updateInfo(journal);
                return effectedNum;
            } catch (Exception e) {
                throw new RuntimeException("submitJournal:" + e.toString());
            }
        } else {
            throw new RuntimeException("submitJournal失败，userId为null/0或者submitJournal为null。" + userId
                    + "/" + submitJournal.getName());
        }
    }

    @Override
    @Transactional
    public int reviewJournal(Integer userId, Integer submitId) {
        if (userId != null && userId != 0 && submitId != null && submitId != 0) {
            try {
                SjournalToUser sjournalToUser = new SjournalToUser();
                sjournalToUser.setUserId(userId);
                sjournalToUser.setSubmitId(submitId);
                sjournalToUser.setRelationship(1);
                return sjournalToUserDao.insertLink(sjournalToUser);
            } catch (Exception e) {
                throw new RuntimeException("reviewJournal出现如下异常:" + e.toString());
            }
        } else {
            throw new RuntimeException("reviewJournal失败，ID为null/0");
        }
    }

    @Override
    @Transactional
    public int deleteReview(Integer userId, Integer submitId) {
        if (userId != null && userId != 0 && submitId != null && submitId != 0) {
            try {
                return sjournalToUserDao.deleteReview(userId, submitId);
            } catch (Exception e) {
                throw new RuntimeException("deleteReview出现如下异常:" + e.toString());
            }
        } else {
            throw new RuntimeException("deleteReview失败，ID为null/0");
        }
    }

    @Override
    @Transactional
    public int deleteSubmitJournal(Integer submitId) {
        if (submitId != null && submitId != 0) {
            try {
                // 删除数据库中的稿件
                submitJournalDao.deleteSubmitJournal(submitId);
                // 删除审稿、投稿关系
                return sjournalToUserDao.deleteSJ(submitId);
            } catch (Exception e) {
                throw new RuntimeException("deleteSubmitJournal出现如下异常:" + e.toString());
            }
        } else {
            throw new RuntimeException("deleteSubmitJournal失败，submitId为null/0");
        }
    }

    @Override
    @Transactional
    public int updateInfo(SubmitJournal submitJournal) {
        if (submitJournal.getSubmitId() != null) {
            try {
                int effectedNum = submitJournalDao.updateInfo(submitJournal);
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
    public List<SubmitJournalPro> getSubmitJournal() {
        List<SubmitJournal> submitJournalList = submitJournalDao.querySubmitJournal();
        List<SubmitJournalPro> submitJournalProList = new ArrayList<>();
        for (SubmitJournal submitJournal : submitJournalList) {
            SubmitJournalPro submitJournalPro = new SubmitJournalPro();
            submitJournalPro.setSubmitJournal(submitJournal);
            submitJournalPro.setJournalName(journalDao.getJournalById(submitJournal.getJournalId()).getName());
            submitJournalProList.add(submitJournalPro);
        }
        return submitJournalProList;
    }

    @Override
    public List<SubmitJournalPro> getSubmitJournalByState(String state) {
        List<SubmitJournal> submitJournalList = submitJournalDao.querySubmitJournalByState(state);
        List<SubmitJournalPro> submitJournalProList = new ArrayList<>();
        for (SubmitJournal submitJournal : submitJournalList) {
            SubmitJournalPro submitJournalPro = new SubmitJournalPro();
            submitJournalPro.setSubmitJournal(submitJournal);
            submitJournalPro.setJournalName(journalDao.getJournalById(submitJournal.getJournalId()).getName());
            submitJournalProList.add(submitJournalPro);
        }
        return submitJournalProList;
    }

    @Override
    public List<SubmitJournalPro> searchJournal(String state, String key) {
        List<SubmitJournal> submitJournalList = submitJournalDao.getSubmitJournalByStateAndKey(state, key);
        List<SubmitJournalPro> submitJournalProList = new ArrayList<>();
        for (SubmitJournal submitJournal : submitJournalList) {
            SubmitJournalPro submitJournalPro = new SubmitJournalPro();
            submitJournalPro.setSubmitJournal(submitJournal);
            submitJournalPro.setJournalName(journalDao.getJournalById(submitJournal.getJournalId()).getName());
            submitJournalProList.add(submitJournalPro);
        }
        return submitJournalProList;
    }

    @Override
    public SubmitJournal getSubmitJournalById(Integer submitId) {
        return submitJournalDao.getSubmitJournalById(submitId);
    }

    @Override
    public List<SubmitJournal> getSubmitJournalByJournalId(Integer journalId) {
        return submitJournalDao.getSubmitJournalByJournalId(journalId);
    }

    @Override
    public List<SubmitJournal> getSubmitJournalByJournalIdAndState(Integer journalId, String state) {
        return submitJournalDao.getSubmitJournalByJournalIdAndState(journalId, state);
    }

    @Override
    public List<SjournalToUser> getLink() {
        return sjournalToUserDao.queryLink();
    }

    @Override
    public User getContributor(Integer submitId) {
        SjournalToUser sjournalToUser = sjournalToUserDao.getContributor(submitId);
        return userDao.getUserById(sjournalToUser.getUserId());
    }

    @Override
    public List<User> getReviewer(Integer submitId) {
        List<SjournalToUser> sjournalToUserList = sjournalToUserDao.getReviewer(submitId);
        List<User> userList = new ArrayList<>();
        for (SjournalToUser sjournalToUser : sjournalToUserList) {
            userList.add(userDao.getUserById(sjournalToUser.getUserId()));
        }
        return userList;
    }

    @Override
    public List<SubmitJournal> getContributedJournal(Integer userId) {
        List<SjournalToUser> sjournalToUserList = sjournalToUserDao.getContributedJournal(userId);
        List<SubmitJournal> submitJournalList = new ArrayList<>();
        for (SjournalToUser sjournalToUser : sjournalToUserList) {
            submitJournalList.add(submitJournalDao.getSubmitJournalById(sjournalToUser.getSubmitId()));
        }
        return submitJournalList;
    }

    @Override
    public List<SubmitJournal> getReviewedJournal(Integer userId) {
        List<SjournalToUser> sjournalToUserList = sjournalToUserDao.getReviewedJournal(userId);
        List<SubmitJournal> submitJournalList = new ArrayList<>();
        for (SjournalToUser sjournalToUser : sjournalToUserList) {
            submitJournalList.add(submitJournalDao.getSubmitJournalById(sjournalToUser.getSubmitId()));
        }
        return submitJournalList;
    }
}
