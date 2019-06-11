package com.bosch.nfc.service.impl;

import com.bosch.nfc.mapper.FeedbackMapper;
import com.bosch.nfc.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Autowired
    private FeedbackMapper feedbackMapper;

    @Override
    public Integer addFeedbackService(String rq, String comment) {
        return feedbackMapper.insertFeedbackRqAndComment(rq, comment);
    }
}
