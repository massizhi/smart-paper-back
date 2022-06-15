package com.massizhi.journalsystem.dao;

import com.massizhi.journalsystem.entity.SubmitJournal;

import java.util.List;

public interface SubmitJournalDao {

    int insertSubmitJournal(SubmitJournal submitJournal);

    int deleteSubmitJournal(Integer submitId);

    int updateInfo(SubmitJournal submitJournal);

    List<SubmitJournal> querySubmitJournal();

    List<SubmitJournal> querySubmitJournalByState(String state);

    List<SubmitJournal> getSubmitJournalByStateAndKey(String state, String key);

    SubmitJournal getSubmitJournalById(Integer submitId);

    Integer getIdByName(String name);

    List<SubmitJournal> getSubmitJournalByJournalId(Integer journalId);

    List<SubmitJournal> getSubmitJournalByJournalIdAndState(Integer journalId, String state);
}
