package com.university.portal.service.implement;

import com.university.portal.model.UserRole;
import com.university.portal.repository.UserRoleRepository;
import com.university.portal.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImp implements UserRoleService {
    @Autowired
    UserRoleRepository userRoleRepisotory;// Object made of the class without the use of NEW Keyword.

    @Override
    public List<UserRole> getAllUserRole() {
        return userRoleRepisotory.findAll();
    }
}
