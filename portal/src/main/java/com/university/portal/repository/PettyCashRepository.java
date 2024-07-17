package com.university.portal.repository;

import com.university.portal.model.PettyCash;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PettyCashRepository extends JpaRepository<PettyCash, Integer> {
}
