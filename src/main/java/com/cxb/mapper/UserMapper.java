package com.cxb.mapper;

import com.cxb.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by MyPC on 2017/10/12.
 */
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    @Results({
            @Result(property = "nickName", column = "nick_name")
    })
    User getUserById(Long id);

    @Select("select * from user")
    @Results({
            @Result(property = "nickName", column = "nick_name")
    })
    List<User> getAll();

    @Insert("insert into user(userName,passWord,nick_name) values(#{userName},#{passWord},#{nick_name})")
    void insert(User user);

    @Update("UPDATE user SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(User user);
}
