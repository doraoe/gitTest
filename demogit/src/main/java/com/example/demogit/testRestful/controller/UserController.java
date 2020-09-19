package com.example.demogit.testRestful.controller;

import com.example.demogit.testRestful.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController("/user")
public class UserController {

    @PostMapping
    public User addUser(User user){
        System.out.println(user);
        return user;
    }

    @GetMapping("/allUser")
    public List<User> allUser(){
        User user = new User();
        user.setuId(111);
        user.setName("lz2");
        List<User> users = new ArrayList<>();
        return users;
    }

    @DeleteMapping("/{uid}")
    public User delUser(@RequestParam("uid") Integer uid){
        User user = new User();
        user.setuId(uid);
        return user;
    }
}
