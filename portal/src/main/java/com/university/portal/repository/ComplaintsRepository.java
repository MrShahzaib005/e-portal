package com.university.portal.repository;

import com.university.portal.model.Complaints;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintsRepository extends JpaRepository<Complaints, Integer> {
}
