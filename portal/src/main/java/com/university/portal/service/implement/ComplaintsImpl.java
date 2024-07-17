package com.university.portal.service.implement;

import com.university.portal.model.Complaints;
import com.university.portal.repository.ComplaintsRepository;
import com.university.portal.service.ComplaintsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ComplaintsImpl implements ComplaintsService {

    @Autowired
    ComplaintsRepository complaintsRepository;

    @Override
    public List<Complaints> getAllComlpaints() {
        return complaintsRepository.findAll();
    }
}
