package com.university.portal.controller;

import com.university.portal.model.NewsEvent;
import com.university.portal.service.NewsEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class NewsEventController {
    @Autowired
    NewsEventService newsEventService;

    @GetMapping("/newsevent")
    public List<NewsEvent> index(){ return newsEventService.getAllNewsEvent(); }

    @GetMapping("/newsevent/{id}")
    public Optional<NewsEvent> getNewsEvent(@PathVariable Integer id) { return newsEventService.getNewsEvent(id); }
}
