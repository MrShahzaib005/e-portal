package com.university.portal.service;

import com.university.portal.model.PettyCash;
import java.util.List;
import java.util.Optional;

public interface PettyCashService {
    public PettyCash create(PettyCash pettyCash);

    public List<PettyCash> getAllPettyCash();

    public Optional<PettyCash> getPettyCash(Integer pettycashid);
}
