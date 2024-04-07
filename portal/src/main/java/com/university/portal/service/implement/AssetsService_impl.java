package com.university.portal.service.implement;

import com.university.portal.model.Assets;
import com.university.portal.repository.AssetRepository;
import com.university.portal.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssetsService_impl implements AssetsService {

    @Autowired
    AssetRepository assetRepository;

    @Override
    public Assets create(Assets assets) {
        return assetRepository.save(assets);
    }
}
