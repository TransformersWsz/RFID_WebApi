package com.bosch.nfc.service;

import com.bosch.nfc.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getAlluser();

    List<User> testDateService(String date);
}
