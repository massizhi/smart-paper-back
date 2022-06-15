package com.massizhi.journalsystem.service.impl;

import com.massizhi.journalsystem.dao.JournalDao;
import com.massizhi.journalsystem.entity.Journal;
import com.massizhi.journalsystem.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class JournalServiceImpl implements JournalService {
    @Autowired
    private JournalDao journalDao;

    @Override
    @Transactional
    public int insertJournal(Journal journal) {
        try {
            int effectedNum = journalDao.insertJournal(journal);
            if (effectedNum > 0) {
                return effectedNum;
            } else {
                throw new RuntimeException("ID已得到，但insertJournal失败");
            }
        } catch (Exception e) {
            throw new RuntimeException("insertJournal出现如下异常:" + e.toString());
        }
    }

    @Override
    @Transactional
    public int updateInfo(Journal journal) {
        if (journal.getJournalId() != null) {
            try {
                int effectedNum = journalDao.updateInfo(journal);
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
    public Journal getJournalById(Integer journalId) {
        return journalDao.getJournalById(journalId);
    }

    @Override
    public List<Journal> queryJournal() {
        return journalDao.queryJournal();
    }

    @Override
    public List<Journal> getJournalByName(String name) {
        return journalDao.getJournalByName(name);
    }

    @Override
    public List<Journal> getJournalInSubmitDate() {
        return journalDao.getJournalInSubmitDate(LocalDate.now());
    }

    @Override
    public List<Journal> getJournalInDate() {
        return journalDao.getJournalInDate(LocalDate.now());
    }
}
