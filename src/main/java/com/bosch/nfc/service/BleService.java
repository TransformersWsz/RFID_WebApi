package com.bosch.nfc.service;

import com.bosch.nfc.pojo.Ble;

import java.util.List;

public interface BleService {
    List<Ble> findBleByRqService(String rq);

    Integer changeBleCountService(String rq);

    Integer addBleRqAndCountService(String rq);

    List<Ble> findBleCountByWeek(Integer limit);
}
