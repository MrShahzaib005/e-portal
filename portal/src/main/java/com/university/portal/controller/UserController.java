package com.university.portal.controller;
import com.university.portal.model.Users;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @PostMapping("/signup")
    public ResponseEntity<String> registerUser(@RequestBody Users user) {

        ResponseEntity response = null;

                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body(user);

        return response;
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser() {

        ResponseEntity response = null;

        response = ResponseEntity
                .status(HttpStatus.FOUND)
                .body("I am in login method");

        return response;
    }


}
