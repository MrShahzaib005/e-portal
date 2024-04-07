package com.university.portal.service.implement;

import com.university.portal.model.Assets;
import com.university.portal.model.Users;
import com.university.portal.repository.AssetRepository;
import com.university.portal.repository.UserRepository;
import com.university.portal.service.AssetsService;
import com.university.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Users create(Users users) {
        return userRepository.save(users);
    }
}
