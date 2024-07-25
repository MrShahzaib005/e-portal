package com.university.portal.service;

import com.university.portal.model.UserRole;

import java.util.List;
import java.util.Optional;

public interface UserRoleService {
    public List<UserRole> getAllUserRole();

    public Optional<UserRole> getUserRole(Integer id);

    public UserRole create(UserRole userRole);

    public UserRole update(UserRole userRole);

    public void deleteAllEntities();

    public void deleteUserRole(Integer userRoleid);
}
