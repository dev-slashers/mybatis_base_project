package com.baits.test.testbaits.controller;

import com.baits.test.testbaits.dto.User;
import com.baits.test.testbaits.repository.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Integer id) {
       return userMapper.findUserById(id);

    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        userMapper.addUser(user);
        List<User> users = userMapper.find(user);
        return users.get(users.size() -1);
    }

}