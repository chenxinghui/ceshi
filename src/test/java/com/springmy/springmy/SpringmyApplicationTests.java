package com.springmy.springmy;

import com.springmy.springmy.pojo.User;
import com.springmy.springmy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.springmy.springmy.mapper")
public class SpringmyApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    public void contextLoads() {
    }

    @Test
    public void  getUser(){
        String id = "1";
        User userList = userService.selectUserid(id);

            System.out.println("输出："+ userList.getName());


    }
}
