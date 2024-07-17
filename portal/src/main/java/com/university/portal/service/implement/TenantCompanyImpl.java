package com.university.portal.service.implement;

import com.university.portal.repository.TenantCompanyRepository;
import com.university.portal.service.TenantCompanyService;
import org.springframework.beans.factory.annotation.Autowired;

public class TenantCompanyImpl implements TenantCompanyService {

    @Autowired
    TenantCompanyRepository tenantCompanyRepository;
}
