package com.massizhi.journalsystem.service;

import com.massizhi.journalsystem.entity.Journal;

import java.time.LocalDate;
import java.util.List;

public interface JournalService {
    // 增加新期刊
    int insertJournal(Journal journal);
    // 修改期刊信息
    int updateInfo(Journal journal);
    // 通过ID得到期刊信息
    Journal getJournalById(Integer journalId);
    // 所有期刊
    List<Journal> queryJournal();
    // 名称查找期刊
    List<Journal> getJournalByName(String name);
    // 在投期刊
    List<Journal> getJournalInSubmitDate();
    // 投稿开始到审稿结束期刊
    List<Journal> getJournalInDate();
}
