package com.example.xaingce;

import com.example.xaingce.eeee.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XaingceApplicationTests {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void testString(){
        Boolean flag = null;
        //插入string
        flag = redisUtil.setString("testString","testString");
        System.out.println(flag);
        String result = "";
        //获取string
        result = redisUtil.getString("testString");
        System.out.println(result);
        //修改string
        flag = redisUtil.getAndSetString("testString","rename");
        System.out.println(flag);
        //获取string
        result = redisUtil.getString("testString");
        System.out.println(result);
        //栓除string
        flag = redisUtil.delete("testString");
        result = redisUtil.getString("testString");
        System.out.println(result);
    }

}
