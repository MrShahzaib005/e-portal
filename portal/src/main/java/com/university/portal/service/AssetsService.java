package com.university.portal.service;

import com.university.portal.model.Assets;

import java.util.List;
import java.util.Optional;

public interface AssetsService {
    public Assets create(Assets assets);

    public void deleteAsset(Integer assetId);

    public Assets update(Assets assets);


    public List<Assets> getAllAssets();

    public Optional<Assets> getAsset(Integer assetId);
}
