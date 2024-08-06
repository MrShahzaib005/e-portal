package com.university.portal.service;

import com.university.portal.model.ParkingTag;
import java.util.List;
import java.util.Optional;

public interface ParkingTagService {
    public List<ParkingTag> getAllParkingTag();

    public Optional<ParkingTag> getParkingTag(Integer parkingtagid);
}
