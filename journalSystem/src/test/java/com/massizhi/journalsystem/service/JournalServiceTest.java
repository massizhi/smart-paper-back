package com.massizhi.journalsystem.service;

import com.massizhi.journalsystem.entity.Journal;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class JournalServiceTest {
//    @Autowired
//    private JournalService journalService;
//
//    @Test
//    void insertJournal() {
//        Journal journal = journalService.getJournalById(1);
//        journal.setJournalId(null);
//        journal.setName("test");
//        journalService.insertJournal(journal);
//    }
//
//    @Test
//    void updateInfo() {
//        Journal journal = journalService.getJournalById(7);
//        journal.setName("cv");
//        journalService.updateInfo(journal);
//    }
//
//    @Test
//    void getJournalById() {
//    }
//
//    @Test
//    void queryJournal() {
//        List<Journal> journalList = journalService.queryJournal();
//        for (Journal journal : journalList) {
//            System.out.println(journal.getName());
//        }
//    }
//
//    @Test
//    void getJournalByName() {
//        List<Journal> journalList = journalService.getJournalByName(".2");
//        for (Journal journal : journalList) {
//            System.out.println(journal.getName());
//        }
//    }
//
//    @Test
//    void getJournalInSubmitDate() {
//        List<Journal> journalList = journalService.getJournalInSubmitDate();
//        for (Journal journal : journalList) {
//            System.out.println(journal.getName());
//        }
//    }
//
//    @Test
//    void getJournalInDate() {
//        List<Journal> journalList = journalService.getJournalInDate();
//        for (Journal journal : journalList) {
//            System.out.println(journal.getName());
//        }
//    }
}