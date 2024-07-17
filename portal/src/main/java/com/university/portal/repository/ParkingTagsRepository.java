package com.university.portal.repository;

import com.university.portal.model.ParkingTags;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingTagsRepository extends JpaRepository<ParkingTags, Integer> {
}
