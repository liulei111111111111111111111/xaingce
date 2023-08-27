package com.example.xaingce.service.impl;

import com.example.xaingce.dao.JsonUserMapper;
import com.example.xaingce.pojo.JsonUser;
import com.example.xaingce.service.JsonUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JsonUserDetailsServiceImpl implements JsonUserDetailsService {
    @Autowired
    private JsonUserMapper jsonUserMapper;


//    public UserDetails loadUserByUsername1(String username) throws UsernameNotFoundException {
//        //根据用户名查询用户信息
//        LambdaQueryWrapper<JsonUser> wrapper = new LambdaQueryWrapper<>();
//        wrapper.eq(JsonUser::getUserName,username);
//        JsonUser jsonuser= (JsonUser) jsonUserMapper.selectOne(wrapper);
//        //如果查询不到数据就通过抛出异常来给出提示
//        if(Objects.isNull(jsonuser)){
//            throw new RuntimeException("用户名或密码错误");
//        }
//        //TODO 根据用户查询权限信息 添加到LoginUser中
//
//        //封装成UserDetails对象返回
//        return new LoginUser(jsonuser);
//    }





    public List<JsonUser> loadUserByUsername() {

        return jsonUserMapper.loadUserByUsername();
    }
}
