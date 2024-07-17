package com.university.portal.repository;

import com.university.portal.model.NewsEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsEventRepository extends JpaRepository<NewsEvent, Integer> {
}
