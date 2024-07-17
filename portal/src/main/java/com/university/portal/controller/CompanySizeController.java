package com.university.portal.controller;
import com.university.portal.model.CompanySize;
import com.university.portal.service.CompanySizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanySizeController {
    @Autowired
    CompanySizeService companySizeService;

    @GetMapping("/companysize")
    public List<CompanySize> index() { return companySizeService.getAllCompanySize();}
}
