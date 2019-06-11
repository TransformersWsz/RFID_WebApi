package com.bosch.nfc.service.impl;

import com.bosch.nfc.mapper.UserMapper;
import com.bosch.nfc.pojo.User;
import com.bosch.nfc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAlluser() {
        return userMapper.findAll();
    }

    @Override
    public List<User> testDateService(String date) {
        return userMapper.testDate(date);
    }


}
