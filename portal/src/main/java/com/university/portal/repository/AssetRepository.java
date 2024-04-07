package com.university.portal.repository;

import com.university.portal.model.Assets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Assets, Integer> {

}
