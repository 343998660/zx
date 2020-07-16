package com.cinsos.zx.service.impl;

import com.cinsos.zx.entity.User;
import com.cinsos.zx.mapper.UserMapper;
import com.cinsos.zx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.lang.model.element.NestingKind;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUserPhone(Float user_phone) {
        return userMapper.findUserPhone(user_phone);
    }

    @Override
    public User findUserEmail(String user_email) {
        return userMapper.findUserEmail(user_email);
    }

}
