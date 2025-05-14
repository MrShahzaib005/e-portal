package com.university.portal.service.implement;

import com.university.portal.model.NewsEvent;
import com.university.portal.repository.NewsEventRepository;
import com.university.portal.service.NewsEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class NewsEventImpl implements NewsEventService {
    @Autowired
    NewsEventRepository newsEventRepository;

    @Override
    public List<NewsEvent> getAllNewsEvent() {
        return newsEventRepository.findAll();
    }

    @Override
    public Optional<NewsEvent> getNewsEvent(Integer newseventid) {
        return newsEventRepository.findById(newseventid);
    }
}
