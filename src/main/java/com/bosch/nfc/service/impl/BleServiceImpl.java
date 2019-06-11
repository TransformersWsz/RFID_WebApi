package com.bosch.nfc.service.impl;

import com.bosch.nfc.mapper.BleMapper;
import com.bosch.nfc.pojo.Ble;
import com.bosch.nfc.service.BleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BleServiceImpl implements BleService {
    @Autowired
    private BleMapper bleMapper;

    @Override
    public List<Ble> findBleByRqService(String rq) {
        return bleMapper.selectBleByRq(rq);
    }

    @Override
    public Integer changeBleCountService(String rq) {
        return bleMapper.updateBleCount(rq);
    }

    @Override
    public Integer addBleRqAndCountService(String rq) {
        return bleMapper.insertBleRqAndCount(rq);
    }

    @Override
    public List<Ble> findBleCountByWeek(Integer limit) {
        return bleMapper.selectBleCountByWeek(limit);
    }
}
