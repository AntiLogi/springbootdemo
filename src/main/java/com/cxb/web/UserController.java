package com.cxb.web;

import com.cxb.entity.User;
import com.cxb.mapper.UserMapper;
import org.apache.ibatis.annotations.Insert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by MyPC on 2017/10/12.
 */
@RestController
public class UserController {
    private Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUsers")
    @Cacheable(value = "users")
    public List<User> getUsers(){
        System.out.println("ssss");
        log.info("aaaaa");
       return userMapper.getAll();

    }

    @RequestMapping(value = "/getUser")
    @Cacheable(value = "user")
    public User getUser(Long id) {
        //Long of = Long.valueOf(id);
        User user=userMapper.getUserById(id);
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
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
