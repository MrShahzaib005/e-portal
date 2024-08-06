package com.university.portal.service.implement;

import com.university.portal.model.GatePass;
import com.university.portal.repository.GatePassRepository;
import com.university.portal.service.GatePassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class GatePassImpl implements GatePassService {

    @Autowired
    GatePassRepository gatePassRepository;

    @Override
    public List<GatePass> getAllGatePass() {
        return gatePassRepository.findAll();
    }

    @Override
    public Optional<GatePass> getGatePass(Integer gatepassid) {
        return gatePassRepository.findById(gatepassid);
    }
}
