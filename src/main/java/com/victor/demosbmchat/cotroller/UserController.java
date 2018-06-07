package com.victor.demosbmchat.cotroller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.victor.demosbmchat.domain.User;
import com.victor.demosbmchat.service.UserService;

@RestController
public class UserController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/greeting")
    public User greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new User();
    }
    @PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user) {
        userService.addUser(user);
        return  userService.retrieveUserById(user.getUserId());
    }
    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable int id) {
        return  userService.retrieveUserById(id);
    }
    @GetMapping(value = "/getUsers")
    public List<User> getAllUser() {
        return  userService.retrieveAllUsers();
    }
}