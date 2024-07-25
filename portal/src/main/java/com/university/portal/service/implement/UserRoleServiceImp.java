package com.university.portal.service.implement;

import com.university.portal.model.UserRole;
import com.university.portal.repository.UserRoleRepository;
import com.university.portal.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRoleServiceImp implements UserRoleService {
    @Autowired
    UserRoleRepository userRoleRepisotory;// Object made of the class without the use of NEW Keyword.

    @Override
    public List<UserRole> getAllUserRole() {
        return userRoleRepisotory.findAll();
    }

    @Override
    public Optional<UserRole> getUserRole(Integer userid) {
        return userRoleRepisotory.findById(userid);
    }

    @Override
    public UserRole create(UserRole userRole) {
        return userRoleRepisotory.save(userRole);
    }

    @Override
    public UserRole update(UserRole userRole) {
        return userRoleRepisotory.save(userRole);
    }

    @Override
    public void deleteAllEntities() {
        userRoleRepisotory.deleteAll();
    }

    @Override
    public void deleteUserRole(Integer userRoleid) {
        userRoleRepisotory.deleteById(userRoleid);
    }
}
