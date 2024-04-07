package com.university.portal.controller;
import com.university.portal.model.Assets;
import com.university.portal.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class AssetsController {
    @Autowired
    AssetsService assetsService;

    @GetMapping("/assets")
    public String index(){
        return "hello from assets controller";
    }

    @PostMapping("/assets/store")
    public Assets saveassets(@RequestBody Assets assets){
        return assetsService.create(assets);
    }
}
