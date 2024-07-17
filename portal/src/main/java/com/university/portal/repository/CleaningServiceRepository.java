package com.university.portal.repository;

import com.university.portal.model.CleaningServices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CleaningServiceRepository extends JpaRepository<CleaningServices, Integer> {
}
