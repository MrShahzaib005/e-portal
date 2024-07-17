package com.university.portal.service.implement;

import com.university.portal.repository.NewsEventRepository;
import com.university.portal.service.NewsEventService;
import org.springframework.beans.factory.annotation.Autowired;

public class NewsEventImpl implements NewsEventService {

    @Autowired
    NewsEventRepository newsEventRepository;
}
