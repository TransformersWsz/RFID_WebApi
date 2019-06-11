package com.bosch.nfc.controller;

import com.bosch.nfc.pojo.Tag;
import com.bosch.nfc.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
public class TagController {
    @Autowired
    private TagService tagService;

    // 每天扫描tag的次数
    @GetMapping("/tag")
    @ResponseBody
    public Integer updateAndAddTagCount() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String rq = simpleDateFormat.format(date.getTime());
        List<Tag> list = tagService.findTagByRqService(rq);
        int size = list.size();
        // 新的一天
        if (size == 0) {
            return tagService.addTagRqAndCountService(rq);
        }
        // 更新当天的次数
        else {
            return tagService.changeTagCountService(rq);
        }
    }

    // 获取每周七天app打开的次数
    @GetMapping("/tag/week")
    @ResponseBody
    public List<Integer> tagWeek(Integer week) {
        List<Tag> list = tagService.findTagCountByWeek((week-1)*7);
        int size = list.size();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            Tag tag = list.get(i);
            integerLinkedList.add(tag.getCount());
        }
        int rest = 7 - size;
        for (int i = 0; i < rest; i++) {
            integerLinkedList.add(0);
        }
        return integerLinkedList;
    }
}
