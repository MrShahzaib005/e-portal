package com.university.portal.service.implement;

import com.university.portal.model.Complaints;
import com.university.portal.repository.ComplaintsRepository;
import com.university.portal.service.ComplaintsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComplaintsImpl implements ComplaintsService {

    @Autowired
    ComplaintsRepository complaintsRepository;

    @Override
    public List<Complaints> getAllComplaints() {
        return complaintsRepository.findAll();
    }
}
