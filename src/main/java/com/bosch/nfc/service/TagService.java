package com.bosch.nfc.service;

import com.bosch.nfc.pojo.Tag;

import java.util.List;

public interface TagService {
    List<Tag> findTagByRqService(String rq);

    Integer changeTagCountService(String rq);

    Integer addTagRqAndCountService(String rq);

    List<Tag> findTagCountByWeek(Integer limit);
}
