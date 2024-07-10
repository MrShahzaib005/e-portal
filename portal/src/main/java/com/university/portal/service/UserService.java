package com.university.portal.service;
import com.university.portal.model.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public Users create(Users users);

    public Users update(Users users);

    public List<Users> getAllUsers();

    public Optional<Users> getUser(Integer userid);

    public void deleteAllEntities();

    public void deleteUser(Integer userid);
}

