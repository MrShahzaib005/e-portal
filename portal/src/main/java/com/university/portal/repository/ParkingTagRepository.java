package com.university.portal.repository;

import com.university.portal.model.ParkingTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingTagRepository extends JpaRepository<ParkingTag, Integer> {
}
