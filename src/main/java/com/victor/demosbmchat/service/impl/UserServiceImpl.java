package com.victor.demosbmchat.service.impl;

import com.victor.demosbmchat.Mapper.UserMapper;
import com.victor.demosbmchat.domain.User;
import com.victor.demosbmchat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void addUser(User user) {
        userMapper.addNewUser(user);
    }

    @Override
    public void delete(int id) {
    userMapper.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
    userMapper.updateUser(user);
    }

    @Override
    public List<User> retrieveAllUsers() {
        return userMapper.retrieveAllUsers();
    }

    @Override
    public User retrieveUserById(int id) {
        return userMapper.retrieveUserById(id);
    }
}
