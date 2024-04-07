package com.university.portal.repository;

import com.university.portal.model.Assets;
import com.university.portal.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
