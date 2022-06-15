package com.massizhi.journalsystem.controller;

import com.massizhi.journalsystem.config.RemovePassword;
import com.massizhi.journalsystem.entity.Journal;
import com.massizhi.journalsystem.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/journal")
@CrossOrigin
public class JournalController {
    @Autowired
    private JournalService journalService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private Map<String, Object> insertJournal(@RequestBody Journal journal) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        if (journal.getReceiveNumber() == null)
            journal.setReceiveNumber(0);
        if (journal.getPageFee() == null)
            journal.setPageFee(0);
        int result = journalService.insertJournal(journal);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "新增期刊失败，请检查必填项");
        }
        return modelMap;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private Map<String, Object> updateInfo(@RequestBody Journal journal) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = journalService.updateInfo(journal);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "journal信息更新失败");
        }
        return modelMap;
    }

    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    private Map<String, Object> getJournalById(Integer journalId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("journal", journalService.getJournalById(journalId));
        return modelMap;
    }

    @RequestMapping(value = "/journals", method = RequestMethod.GET)
    private Map<String, Object> getJournals() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("journalList", journalService.queryJournal());
        return modelMap;
    }

    @RequestMapping(value = "/getbyname", method = RequestMethod.GET)
    private Map<String, Object> getJournalByName(String name) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("journalList", journalService.getJournalByName(name));
        return modelMap;
    }

    @RequestMapping(value = "/insubmitdate", method = RequestMethod.GET)
    private Map<String, Object> getJournalInSubmitDate() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("journalList", journalService.getJournalInSubmitDate());
        return modelMap;
    }

    @RequestMapping(value = "/indate", method = RequestMethod.GET)
    private Map<String, Object> getJournalInDate() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("journalList", journalService.getJournalInDate());
        return modelMap;
    }

}
