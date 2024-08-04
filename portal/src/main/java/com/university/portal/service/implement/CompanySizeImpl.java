package com.university.portal.service.implement;

import com.university.portal.model.CompanySize;
import com.university.portal.repository.CompanySizeRepository;
import com.university.portal.service.CompanySizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class CompanySizeImpl implements CompanySizeService {

    @Autowired
    CompanySizeRepository companySizeRepository;

    @Override
    public List<CompanySize> getAllCompanySize() {
        return companySizeRepository.findAll();
    }
}
