package com.massizhi.journalsystem.dao;

import com.massizhi.journalsystem.entity.Journal;

import java.time.LocalDate;
import java.util.List;

public interface JournalDao {

    int insertJournal(Journal journal);

    int updateInfo(Journal journal);

    List<Journal> queryJournal();

    Journal getJournalById(Integer journalId);

    List<Journal> getJournalByName(String name);

    List<Journal> getJournalInSubmitDate(LocalDate localDate);

    List<Journal> getJournalInDate(LocalDate localDate);
}
