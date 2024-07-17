package com.university.portal.repository;

import com.university.portal.model.MeetingLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingLocationRepository extends JpaRepository<MeetingLocation, Integer> {
}
