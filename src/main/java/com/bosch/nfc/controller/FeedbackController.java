package com.bosch.nfc.controller;

import com.bosch.nfc.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;

@Controller
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/feedback")
    @ResponseBody
    public HashMap<String, Integer> addComment(String comment) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String rq = simpleDateFormat.format(date.getTime());
        feedbackService.addFeedbackService(rq, comment);
        HashMap<String, Integer> hashMap = new HashMap();
        hashMap.put("result", 1);
        return hashMap;
    }
}
