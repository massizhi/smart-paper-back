package com.massizhi.journalsystem.dao;

import com.massizhi.journalsystem.entity.Journal;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class JournalDaoTest {
//    @Autowired
//    private JournalDao journalDao;
//
//    @Test
//    void insertJournal() {
//        Journal journal = new Journal();
//        journal.setName("test");
////        journal.setIntroduction();
//        journal.setPageFee(0);
//        journal.setPublishNumber(100);
//        journal.setReceiveNumber(0);
//        journal.setStartDate(LocalDate.now());
//        journal.setPublishDate(LocalDate.of(2020, 1, 1));
//        journal.setSubmitStartDate(LocalDate.now());
//        journal.setSubmitEndDate(LocalDate.now());
//        journal.setDistributeStartDate(LocalDate.now());
//        journal.setDistributeEndDate(LocalDate.now());
//        journal.setReviewStartDate(LocalDate.now());
//        journal.setReviewEndDate(LocalDate.now());
//        journalDao.insertJournal(journal);
//    }
//
//    @Test
//    void updateInfo() {
//        Journal journal = new Journal();
//        journal.setJournalId(5);
//        journal.setName("test hello world");
////        journal.setIntroduction();
//        journal.setPageFee(0);
//        journal.setPublishNumber(100);
////        journal.setReceiveNumber(0);
//        journal.setStartDate(LocalDate.now());
//        journal.setPublishDate(LocalDate.of(2020, 1, 1));
//        journal.setSubmitStartDate(LocalDate.now());
//        journal.setSubmitEndDate(LocalDate.now());
//        journal.setDistributeStartDate(LocalDate.now());
//        journal.setDistributeEndDate(LocalDate.now());
//        journal.setReviewStartDate(LocalDate.now());
//        journal.setReviewEndDate(LocalDate.now());
//        journalDao.updateInfo(journal);
//    }
//
//    @Test
//    void queryJournal() {
//        List<Journal> journalList = journalDao.queryJournal();
//        System.out.println(journalList.size());
//        System.out.println(journalList.get(0).getName());
//    }
//
//
//    @Test
//    void getJournalById() {
//        Journal journal = journalDao.getJournalById(1);
//        System.out.println(journal.getName());
//    }
//
//    @Test
//    void getJournalByName() {
//        List<Journal> journalList = journalDao.getJournalByName("2022");
//        System.out.println(journalList.size());
//        System.out.println(journalList.get(0).getName());
//    }
//
//    @Test
//    void getJournalInSubmitDate() {
//        List<Journal> journalList = journalDao.getJournalInSubmitDate(LocalDate.of(2021,1,1));
//        System.out.println(journalList.size());
//        System.out.println(journalList.get(0).getName());
//    }
//
//    @Test
//    void getJournalInDate() {
//        List<Journal> journalList = journalDao.getJournalInDate(LocalDate.now());
//        System.out.println(journalList.size());
//        System.out.println(journalList.get(0).getName());
//    }
}