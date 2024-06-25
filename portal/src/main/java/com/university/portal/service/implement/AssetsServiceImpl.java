package com.university.portal.service.implement;
//implementation of interface.
import com.university.portal.model.Assets;
import com.university.portal.repository.AssetRepository;
import com.university.portal.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssetsServiceImpl implements AssetsService {

    @Autowired
    AssetRepository assetRepository;

    @Override
    public Assets create(Assets assets) {
        return assetRepository.save(assets);
    }

    @Override
    public void deleteAsset(Integer assetId) {
        assetRepository.deleteById(assetId);
    }

    @Override
    public Assets update(Assets assets) {
       return assetRepository.save(assets);
    }

    @Override
    public List<Assets> getAllAssets() {
        return assetRepository.findAll();
    }

    @Override
    public Optional<Assets> getAsset(Integer assetId) {
        return assetRepository.findById(assetId);
    }

    @Override
    public void deleteAllEntities() {
        assetRepository.deleteAll();
    }



}
