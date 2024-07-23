package com.university.portal.controller;
import com.university.portal.model.Users;
import com.university.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<Users> index(){
        return userService.getAllUsers();
    }

    @PostMapping("/users/store")
    public Users saveUser(@RequestBody Users users){
        return userService.create(users);
    }

    @PostMapping("users/update")
    public Users updateUser(@RequestBody Users users){ return userService.update(users);}

    @GetMapping("/users/{id}")
    public Optional<Users> getUser(@PathVariable Integer id) {return userService.getUser(id);}

    @DeleteMapping("/users/delete")
    public ResponseEntity<Void> deleteAllEntities()
    { userService.deleteAllEntities();
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/users/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id)
    {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

}
