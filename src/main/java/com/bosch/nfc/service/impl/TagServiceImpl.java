package com.bosch.nfc.service.impl;

import com.bosch.nfc.mapper.TagMapper;
import com.bosch.nfc.pojo.Tag;
import com.bosch.nfc.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<Tag> findTagByRqService(String rq) {
        return tagMapper.selectTagByRq(rq);
    }

    @Override
    public Integer changeTagCountService(String rq) {
        return tagMapper.updateTagCount(rq);
    }

    @Override
    public Integer addTagRqAndCountService(String rq) {
        return tagMapper.insertTagRqAndCount(rq);
    }

    @Override
    public List<Tag> findTagCountByWeek(Integer limit) {
        return tagMapper.selectTagCountByWeek(limit);
    }
}
