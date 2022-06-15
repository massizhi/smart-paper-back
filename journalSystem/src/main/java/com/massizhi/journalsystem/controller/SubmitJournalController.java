package com.massizhi.journalsystem.controller;

import com.massizhi.journalsystem.config.RemovePassword;
import com.massizhi.journalsystem.entity.SubmitJournal;
import com.massizhi.journalsystem.entity.User;
import com.massizhi.journalsystem.entity.UserSubmit;
import com.massizhi.journalsystem.service.SubmitJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/submitjournal")
@CrossOrigin
public class SubmitJournalController {
    @Autowired
    private SubmitJournalService submitJournalService;

    @RequestMapping(value = "/submitjournal", method = RequestMethod.POST)
    private Map<String, Object> submitJournal(@RequestBody UserSubmit userSubmit) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = submitJournalService.submitJournal(userSubmit.getUserId(), userSubmit.getSubmitJournal());
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "提交稿件失败，请检查必填项");
        }
        return modelMap;
    }

    @RequestMapping(value = "/reviewjournal", method = RequestMethod.POST)
    private Map<String, Object> reviewJournal(Integer userId, Integer submitId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = submitJournalService.reviewJournal(userId, submitId);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "增加审稿关系失败，请检查id");
        }
        return modelMap;
    }

    @RequestMapping(value = "/deletereview", method = RequestMethod.POST)
    private Map<String, Object> deleteReview(Integer userId, Integer submitId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = submitJournalService.deleteReview(userId, submitId);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "删除审稿关系失败，请检查id");
        }
        return modelMap;
    }

    @RequestMapping(value = "/deletesubmitjournal", method = RequestMethod.POST)
    private Map<String, Object> deleteSubmitJournal(Integer submitId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = submitJournalService.deleteSubmitJournal(submitId);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "删除稿件失败，请检查id");
        }
        return modelMap;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private Map<String, Object> updateInfo(@RequestBody SubmitJournal submitJournal) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int result = submitJournalService.updateInfo(submitJournal);
        if (result > 0) {
            modelMap.put("message", "success");
        } else {
            modelMap.put("message", "submitJournal信息更新失败");
        }
        return modelMap;
    }

    @RequestMapping(value = "/getbyid", method = RequestMethod.GET)
    private Map<String, Object> getSubmitJournalById(Integer submitId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("submitJournal", submitJournalService.getSubmitJournalById(submitId));
        return modelMap;
    }

    @RequestMapping(value = "/submitjournals", method = RequestMethod.GET)
    private Map<String, Object> getSubmitJournal() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("submitJournalList", submitJournalService.getSubmitJournal());
        return modelMap;
    }

    @RequestMapping(value = "/submitjournalsbystate", method = RequestMethod.GET)
    private Map<String, Object> getSubmitJournalByState(String state) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("submitJournalList", submitJournalService.getSubmitJournalByState(state));
        return modelMap;
    }

    @RequestMapping(value = "/searchjournal", method = RequestMethod.GET)
    private Map<String, Object> searchJournal(String state, String key) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("submitJournalList", submitJournalService.searchJournal(state, key));
        return modelMap;
    }

    @RequestMapping(value = "/getbyjournalid", method = RequestMethod.GET)
    private Map<String, Object> getSubmitJournalByJournalId(Integer journalId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("submitJournal", submitJournalService.getSubmitJournalByJournalId(journalId));
        return modelMap;
    }

    @RequestMapping(value = "/getbyjournalidandstate", method = RequestMethod.GET)
    private Map<String, Object> getSubmitJournalByJournalIdAndState(Integer journalId, String state) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("submitJournalList", submitJournalService.getSubmitJournalByJournalIdAndState(journalId, state));
        return modelMap;
    }

    @RequestMapping(value = "/getlink", method = RequestMethod.GET)
    private Map<String, Object> getLink() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("linkList", submitJournalService.getLink());
        return modelMap;
    }

    @RequestMapping(value = "/getcontributor", method = RequestMethod.GET)
    private Map<String, Object> getContributor(Integer submitId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        User user = submitJournalService.getContributor(submitId);
        user.setPassword(null);
        modelMap.put("userList", user);
        return modelMap;
    }

    @RequestMapping(value = "/getreviewer", method = RequestMethod.GET)
    private Map<String, Object> getReviewer(Integer submitId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("userList", RemovePassword.userRP(submitJournalService.getReviewer(submitId)));
        return modelMap;
    }

    @RequestMapping(value = "/getcontributedjournal", method = RequestMethod.GET)
    private Map<String, Object> getContributedJournal(Integer userId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("submitJournalList", submitJournalService.getContributedJournal(userId));
        return modelMap;
    }

    @RequestMapping(value = "/getreviewedjournal", method = RequestMethod.GET)
    private Map<String, Object> getReviewedJournal(Integer userId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("submitJournalList", submitJournalService.getReviewedJournal(userId));
        return modelMap;
    }
}
