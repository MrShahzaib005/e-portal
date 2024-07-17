package com.university.portal.service.implement;

import com.university.portal.repository.PettyCashRepository;
import com.university.portal.service.PettyCashService;
import org.springframework.beans.factory.annotation.Autowired;

public class PettyCashImpl implements PettyCashService {

    @Autowired
    PettyCashRepository pettyCashRepository;
}
