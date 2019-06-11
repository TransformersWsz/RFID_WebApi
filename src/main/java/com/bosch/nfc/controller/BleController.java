package com.bosch.nfc.controller;

import com.bosch.nfc.pojo.Ble;
import com.bosch.nfc.service.BleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
public class BleController {

    @Autowired
    private BleService bleService;

    // 每天打开app的次数
    @GetMapping("/ble")
    @ResponseBody
    public Integer updateAndAddBleCount() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String rq = simpleDateFormat.format(date.getTime());
        List<Ble> list = bleService.findBleByRqService(rq);
        int size = list.size();
        //新的一天
        if (size == 0) {
            return bleService.addBleRqAndCountService(rq);
        }
        // 更新当天的次数
        else {
            return bleService.changeBleCountService(rq);
        }
    }

    // 获取每周七天app打开的次数
    @GetMapping("/ble/week")
    @ResponseBody
    public List<Integer> bleWeek(Integer week) {
        List<Ble> list = bleService.findBleCountByWeek((week-1)*7);
        int size = list.size();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            Ble ble = list.get(i);
            integerLinkedList.add(ble.getCount());
        }
        int rest = 7 - size;
        for (int i = 0; i < rest; i++) {
            integerLinkedList.add(0);
        }
        return integerLinkedList;
    }
}
