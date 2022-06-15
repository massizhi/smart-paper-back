package com.massizhi.journalsystem.dao;

import com.massizhi.journalsystem.entity.SubmitJournal;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SubmitJournalDaoTest {
//
//    @Autowired
//    private SubmitJournalDao submitJournalDao;
//
//    @Test
//    void insertSubmitJournal() {
//        SubmitJournal submitJournal = new SubmitJournal();
//        submitJournal.setJournalId(1);
//        submitJournal.setName("test");
//        submitJournal.setState("delieving");
//        submitJournal.setJournalAbstract("hello");
//        submitJournal.setFileName("as");
//        submitJournal.setFilePath("asf");
//        submitJournal.setAuthors("dfg");
//        submitJournal.setCorrespondingAuthor("gd");
//        submitJournalDao.insertSubmitJournal(submitJournal);
//    }
//
//    @Test
//    void deleteSubmitJournal() {
//        submitJournalDao.deleteSubmitJournal(24);
//    }
//
//    @Test
//    void updateInfo() {
//        SubmitJournal submitJournal = new SubmitJournal();
//        submitJournal.setSubmitId(24);
////        submitJournal.setJournalId(2);
//        submitJournal.setName("testfdghsfhg");
//        submitJournal.setState("delieving");
//        submitJournal.setJournalAbstract("hello world");
//        submitJournal.setFileName("assdaf");
//        submitJournal.setFilePath("asfsdag");
//        submitJournal.setAuthors("dfgasdg");
//        submitJournal.setCorrespondingAuthor("gdsdga");
//        submitJournalDao.updateInfo(submitJournal);
//    }
//
//    @Test
//    void querySubmitJournal() {
//        List<SubmitJournal> submitJournals = submitJournalDao.querySubmitJournal();
//        System.out.println(submitJournals.size());
//        System.out.println(submitJournals.get(0).getName());
//    }
//
//    @Test
//    void getSubmitJournalByStateAndKey() {
//        List<SubmitJournal> submitJournals = submitJournalDao.getSubmitJournalByStateAndKey("received", "model");
//        for (SubmitJournal submitJournal : submitJournals)
//            System.out.println(submitJournal.getName());
//    }
//
//    @Test
//    void querySubmitJournalByState() {
//        List<SubmitJournal> submitJournals = submitJournalDao.querySubmitJournalByState("received");
//        for (SubmitJournal submitJournal : submitJournals)
//            System.out.println(submitJournal.getName());
//    }
//
//    @Test
//    void getSubmitJournalById() {
//        SubmitJournal submitJournal = submitJournalDao.getSubmitJournalById(1);
//        System.out.println(submitJournal.getName());
//    }
//
//    @Test
//    void getSubmitJournalByJournalId() {
//        List<SubmitJournal> submitJournals = submitJournalDao.getSubmitJournalByJournalId(1);
//        System.out.println(submitJournals.size());
//        System.out.println(submitJournals.get(0).getName());
//    }
//
//    @Test
//    void getIdByName() {
//        System.out.println(submitJournalDao.getIdByName("Multi-Objective Parallel Attribute Reduction Algorithm In Rough Set"));
//    }
//
//    @Test
//    void getSubmitJournalByJournalIdAndState() {
//        List<SubmitJournal> submitJournals = submitJournalDao.getSubmitJournalByJournalIdAndState(3, "received");
//        for (SubmitJournal submitJournal : submitJournals)
//            System.out.println(submitJournal.getName());
//    }
}