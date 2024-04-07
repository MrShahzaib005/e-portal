package com.university.portal.controller;
import com.university.portal.model.Assets;
import com.university.portal.model.Users;
import com.university.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public String index(){
        return "hello from user controller";
    }

    @PostMapping("/users/store")
    public Users saveUser(@RequestBody Users users){
        return userService.create(users);
    }


}
