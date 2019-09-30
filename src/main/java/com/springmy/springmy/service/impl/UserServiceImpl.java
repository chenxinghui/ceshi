package com.springmy.springmy.service.impl;

import com.springmy.springmy.mapper.UpdateUserMapper;
import com.springmy.springmy.pojo.User;
import com.springmy.springmy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UpdateUserMapper updateUserMapper;
    @Override
    public User selectUserid(String id) {
       User userList =  updateUserMapper.selectId(id);
        return userList;
    }
}
