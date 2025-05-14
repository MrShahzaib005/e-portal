package com.university.portal.controller;
import com.university.portal.model.UserRole;
import com.university.portal.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class UserRoleController {
    @Autowired
    UserRoleService userRoleService;

    @GetMapping("/userRole")
    public List<UserRole> index() { return userRoleService.getAllUserRole();}

    @GetMapping("/userRole/{id}")
    public Optional<UserRole> getUserRole(@PathVariable Integer id){ return userRoleService.getUserRole(id);}

    @PostMapping("/userRole/store")
    public UserRole saveUserRole(@RequestBody UserRole userRole){ return userRoleService.create(userRole);}

    @PostMapping("/userRole/update")
    public UserRole updateUserRole(@RequestBody UserRole userRole){ return userRoleService.update(userRole);}

    @DeleteMapping("/userRole/delete")
    public ResponseEntity<Void> deleteAllEntities(){
        userRoleService.deleteAllEntities();
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/userRole/delete/{id}")
    public ResponseEntity<Void> deleteUserRole(@PathVariable Integer id) {
        userRoleService.deleteUserRole(id);
        return ResponseEntity.noContent().build();
    }
}
