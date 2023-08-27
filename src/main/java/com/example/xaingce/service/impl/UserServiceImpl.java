package com.example.xaingce.service.impl;

import com.example.xaingce.dao.UserMapper;
import com.example.xaingce.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    public List findAllUser() {
        return userMapper.findAllUser();
    }
}
