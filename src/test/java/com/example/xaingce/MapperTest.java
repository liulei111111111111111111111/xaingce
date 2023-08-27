package com.example.xaingce;

import com.example.xaingce.dao.JsonUserMapper;
import com.example.xaingce.dao.UserMapper;
import com.example.xaingce.pojo.JsonUser;
import com.example.xaingce.service.impl.JsonUserDetailsServiceImpl;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan(basePackages ="com.example.xaingce.dao")
public class MapperTest {


    @Autowired
    private JsonUserMapper jsonUserMapper;

    @Autowired
    private JsonUserDetailsServiceImpl jsonUserDetailsService;
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserMapper(){
        List users = userMapper.findAllUser();
        System.out.println(users);
    }
}