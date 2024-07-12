package com.university.portal.controller;
import com.university.portal.model.UserRole;
import com.university.portal.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserRoleController {
    @Autowired
    UserRoleService userRoleService;

    @GetMapping("/userRole")
    public List<UserRole> index() { return userRoleService.getAllUserRole();}
}
