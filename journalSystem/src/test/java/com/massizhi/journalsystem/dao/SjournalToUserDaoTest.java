package com.massizhi.journalsystem.dao;

import com.massizhi.journalsystem.entity.SjournalToUser;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SjournalToUserDaoTest {
//
//    @Autowired
//    private SjournalToUserDao sjournalToUserDao;
//
//    @Test
//    void insertLink() {
//        SjournalToUser sjournalToUser = new SjournalToUser();
//        sjournalToUser.setUserId(2);
//        sjournalToUser.setSubmitId(10);
//        sjournalToUser.setRelationship(1);
//        sjournalToUserDao.insertLink(sjournalToUser);
//    }
//
//    @Test
//    void deleteReview() {
//        sjournalToUserDao.deleteReview(2,10);
//    }
//
//    @Test
//    void deleteSJ() {
//        sjournalToUserDao.deleteSJ(100);
//    }
//
//    @Test
//    void queryLink() {
//        List<SjournalToUser> sjournalToUserList = sjournalToUserDao.queryLink();
//        System.out.println(sjournalToUserList.size());
//    }
//
//    @Test
//    void getContributor() {
//        SjournalToUser sjournalToUser = sjournalToUserDao.getContributor(9);
//        System.out.println(sjournalToUser.getLinkId());
//    }
//
//    @Test
//    void getReviewer() {
//        List<SjournalToUser> sjournalToUserList = sjournalToUserDao.getReviewer(6);
//        System.out.println(sjournalToUserList.size());
//    }
//
//    @Test
//    void getContributedJournal() {
//        List<SjournalToUser> sjournalToUserList = sjournalToUserDao.getContributedJournal(1);
//        System.out.println(sjournalToUserList.size());
//    }
//
//    @Test
//    void getReviewedJournal() {
//        List<SjournalToUser> sjournalToUserList = sjournalToUserDao.getReviewedJournal(3);
//        System.out.println(sjournalToUserList.size());
//    }
}