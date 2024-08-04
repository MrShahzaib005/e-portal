package com.university.portal.controller;

import com.university.portal.model.NewsEvent;
import com.university.portal.service.NewsEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class NewsEventController {
    @Autowired
    NewsEventService newsEventService;

    @GetMapping("/newsevent")
    public List<NewsEvent> index(){ return newsEventService.getAllNewsEvent();}
}
