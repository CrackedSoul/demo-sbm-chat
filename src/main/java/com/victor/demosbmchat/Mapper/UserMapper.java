package com.victor.demosbmchat.Mapper;
import java.util.List;

import com.victor.demosbmchat.domain.User;
import org.apache.ibatis.annotations.*;
;

@Mapper
public interface UserMapper {
    @Select("select * from t_user")
    List<User> retrieveAllUsers();

    //注意这里只有一个参数，则#{}中的标识符可以任意取
    @Select("select * from t_user where userId=#{id}")
     User retrieveUserById(int id);

    @Insert("INSERT INTO t_user(userName,password,phone) VALUES(#{userName},"
            + "#{password},#{phone})")
     void addNewUser(User user);

    @Delete("delete from t_user where userId=#{id}")
     void deleteUser(int id);

    @Update("update user set userName=#{userName},password=#{password},phone=#{phone}"
            + " where userId=#{id}")
     void updateUser(User user);
}
