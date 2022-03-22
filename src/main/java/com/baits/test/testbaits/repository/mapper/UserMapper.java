package com.baits.test.testbaits.repository.mapper;

import com.baits.test.testbaits.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
   User findUserById(int id);

   List<User> find(User user);
   void  addUser(User user);
}