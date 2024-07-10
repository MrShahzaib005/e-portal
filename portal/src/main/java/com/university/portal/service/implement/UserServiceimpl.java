package com.university.portal.service.implement;
import com.university.portal.model.Assets;
import com.university.portal.model.Users;
import com.university.portal.repository.UserRepository;
import com.university.portal.repository.AssetRepository;
import com.university.portal.service.UserService;
import com.university.portal.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Users create(Users users) {
        return userRepository.save(users);
    }

    @Override
    public Users update(Users users) {
        return userRepository.save(users);
    }

    @Override
    public List<Users> getAllUsers() { return userRepository.findAll();}

    @Override
    public Optional<Users> getUser(Integer userid) {
        return userRepository.findById(userid);
    }

    @Override
    public void deleteAllEntities() {
         userRepository.deleteAll();
    }

    @Override
    public void deleteUser(Integer userid) {
        userRepository.deleteById(userid);
    }


}
