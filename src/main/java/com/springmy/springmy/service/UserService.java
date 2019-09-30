package com.springmy.springmy.service;

import com.springmy.springmy.pojo.User;
import org.springframework.stereotype.Component;
@Component
public interface UserService {

   User selectUserid(String id);
}
