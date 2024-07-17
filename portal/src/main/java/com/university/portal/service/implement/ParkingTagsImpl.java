package com.university.portal.service.implement;

import com.university.portal.repository.ParkingTagsRepository;
import com.university.portal.service.ParkingTagsService;
import org.springframework.beans.factory.annotation.Autowired;

public class ParkingTagsImpl implements ParkingTagsService {

    @Autowired
    ParkingTagsRepository parkingTagsRepository;
}
