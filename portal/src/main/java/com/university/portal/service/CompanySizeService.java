package com.university.portal.service;

import com.university.portal.model.CompanySize;

import java.util.List;
import java.util.Optional;

public interface CompanySizeService {
    public List<CompanySize> getAllCompanySize();

     public Optional<CompanySize> getCompanySize(Integer companysizeid);
}
