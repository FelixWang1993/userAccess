package com.maya.useraccess.controller;
import com.maya.useraccess.model.UserModel;
import com.maya.useraccess.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/users")
    public int addUsers(@RequestBody UserModel user) {
        return userService.addUsers(user);
    }

    @DeleteMapping("/users/{userId}")
    public int addUsers(@PathVariable Long userId) {
        return userService.removeUserById(userId);
    }
}