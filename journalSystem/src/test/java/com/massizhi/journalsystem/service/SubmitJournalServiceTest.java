package com.massizhi.journalsystem.service;

import com.massizhi.journalsystem.entity.Journal;
import com.massizhi.journalsystem.entity.SubmitJournal;
import com.massizhi.journalsystem.entity.SubmitJournalPro;
import com.massizhi.journalsystem.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SubmitJournalServiceTest {
//    @Autowired
//    private SubmitJournalService submitJournalService;
//
//    @Test
//    void submitJournal() {
//        SubmitJournal submitJournal = submitJournalService.getSubmitJournalById(10);
//        submitJournal.setSubmitId(null);
//        submitJournal.setName("hello world!");
//        System.out.println(submitJournalService.submitJournal(3, submitJournal));
//    }
//
//    @Test
//    void reviewJournal() {
//        System.out.println(submitJournalService.reviewJournal(2, 25));
//    }
//
//    @Test
//    void deleteReview() {
//        submitJournalService.deleteReview(2,25);
//    }
//
//    @Test
//    void deleteSubmitJournal() {
//        submitJournalService.deleteSubmitJournal(25);
//    }
//
//    @Test
//    void updateInfo() {
//        SubmitJournal submitJournal = submitJournalService.getSubmitJournalById(25);
//        submitJournal.setCorrespondingAuthor("makexue");
//        submitJournalService.updateInfo(submitJournal);
//    }
//
//    @Test
//    void getSubmitJournal() {
//        List<SubmitJournalPro> submitJournalProList = submitJournalService.getSubmitJournal();
//        for (SubmitJournalPro submitJournalPro : submitJournalProList) {
//            System.out.println(submitJournalPro.getSubmitJournal().getSubmitId());
//            System.out.println(submitJournalPro.getJournalName());
//        }
//    }
//
//    @Test
//    void getSubmitJournalByState() {
//        List<SubmitJournalPro> submitJournalProList = submitJournalService.getSubmitJournalByState("allocating");
//        for (SubmitJournalPro submitJournalPro : submitJournalProList) {
//            System.out.println(submitJournalPro.getSubmitJournal().getSubmitId());
//            System.out.println(submitJournalPro.getJournalName());
//        }
//    }
//
//    @Test
//    void searchJournal() {
//        List<SubmitJournalPro> submitJournalProList = submitJournalService.searchJournal("accept", "mode");
//        for (SubmitJournalPro submitJournalPro : submitJournalProList) {
//            System.out.println(submitJournalPro.getSubmitJournal().getName());
//            System.out.println(submitJournalPro.getJournalName());
//        }
//    }
//
//    @Test
//    void getSubmitJournalById() {
//
//    }
//
//    @Test
//    void getSubmitJournalByJournalId() {
//        List<SubmitJournal> submitJournalList = submitJournalService.getSubmitJournalByJournalId(3);
//        for (SubmitJournal submitJournal : submitJournalList) {
//            System.out.println(submitJournal.getSubmitId());
//        }
//    }
//
//    @Test
//    void getSubmitJournalByJournalIdAndState() {
//        List<SubmitJournal> submitJournalList = submitJournalService.getSubmitJournalByJournalIdAndState(4, "allocating");
//        for (SubmitJournal submitJournal : submitJournalList) {
//            System.out.println(submitJournal.getSubmitId());
//        }
//    }
//
//    @Test
//    void getLink() {
//        System.out.println(submitJournalService.getLink().size());
//    }
//
//    @Test
//    void getContributor() {
//        System.out.println(submitJournalService.getContributor(9).getUserId());
//    }
//
//    @Test
//    void getReviewer() {
//        List<User> userList = submitJournalService.getReviewer(5);
//        for (User user : userList) {
//            System.out.println(user.getUserId());
//        }
//    }
//
//    @Test
//    void getContributedJournal() {
//        List<SubmitJournal> submitJournalList = submitJournalService.getContributedJournal(1);
//        for (SubmitJournal submitJournal : submitJournalList) {
//            System.out.println(submitJournal.getSubmitId());
//        }
//    }
//
//    @Test
//    void getReviewedJournal() {
//        List<SubmitJournal> submitJournalList = submitJournalService.getReviewedJournal(3);
//        for (SubmitJournal submitJournal : submitJournalList) {
//            System.out.println(submitJournal.getSubmitId());
//        }
//    }
}