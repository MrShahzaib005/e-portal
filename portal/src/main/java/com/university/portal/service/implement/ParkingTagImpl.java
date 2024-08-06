package com.university.portal.service.implement;

import com.university.portal.model.ParkingTag;
import com.university.portal.repository.ParkingTagRepository;
import com.university.portal.service.ParkingTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParkingTagImpl implements ParkingTagService {
    @Autowired
    ParkingTagRepository parkingTagRepository;

    @Override
    public List<ParkingTag> getAllParkingTag() {
        return parkingTagRepository.findAll();
    }

    @Override
    public Optional<ParkingTag> getParkingTag(Integer parkingtagid) {
        return parkingTagRepository.findById(parkingtagid);
    }
}
