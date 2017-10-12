package com.cxb.web;

import com.cxb.entity.User;
import com.cxb.mapper.UserMapper;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by MyPC on 2017/10/12.
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUsers")
    public List<User> getUsers(){
       return userMapper.getAll();
    }

    @RequestMapping("/getUser")
    public User getUser(Long id) {
        User user=userMapper.getUserById(id);
        return user;
    }

    @RequestMapping("/add")
    public void insert(User user) {
        userMapper.insert(user);
    }

    @RequestMapping(value="update")
    public void update(User user) {
        userMapper.update(user);
    }

}
