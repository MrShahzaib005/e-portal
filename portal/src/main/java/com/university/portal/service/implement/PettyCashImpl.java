package com.university.portal.service.implement;

import com.university.portal.model.PettyCash;
import com.university.portal.repository.PettyCashRepository;
import com.university.portal.service.PettyCashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PettyCashImpl implements PettyCashService {

    @Autowired
    PettyCashRepository pettyCashRepository;

    @Override
    public PettyCash create(PettyCash pettyCash) {
        return pettyCashRepository.save(pettyCash);
    }

    @Override
    public List<PettyCash> getAllPettyCash() {
        return pettyCashRepository.findAll();
    }

    @Override
    public Optional<PettyCash> getPettyCash(Integer pettycashid) {
        return pettyCashRepository.findById(pettycashid);
    }
}
