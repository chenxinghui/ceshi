package com.springmy.springmy.mapper;

import com.springmy.springmy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface UpdateUserMapper {

    User selectId(String id);
}
