package com.university.portal.controller;
import com.university.portal.model.Assets;
import com.university.portal.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AssetsController {
    @Autowired
    AssetsService assetsService;

    @GetMapping("/assets")
    public List<Assets> index(){
        return assetsService.getAllAssets();
    }

    @GetMapping("/assets/{id}")
    public Optional<Assets> getAsset(@PathVariable Integer id){
        return assetsService.getAsset(id);
    }

    @PostMapping("/assets/store")
    public Assets saveassets(@RequestBody Assets assets){
        return assetsService.create(assets);
    }

    @DeleteMapping("/assets/delete/{id}")
    public ResponseEntity<Void> deleteAsset(@PathVariable Integer id) {
        assetsService.deleteAsset(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/assets/update")
    public Assets updateassets(@RequestBody Assets assets){
        return assetsService.update(assets);
    }

}
