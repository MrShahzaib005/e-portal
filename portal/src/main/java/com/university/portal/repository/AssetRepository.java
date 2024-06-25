package com.university.portal.repository;
//it connects us with the database by passing the object.
import com.university.portal.model.Assets;
import org.springframework.data.jpa.repository.JpaRepository;
//JRepository base class which links to the database.
public interface AssetRepository extends JpaRepository<Assets, Integer> {

}
