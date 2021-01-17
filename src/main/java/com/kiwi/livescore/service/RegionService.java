package com.kiwi.livescore.service;

import com.kiwi.livescore.model.Region;
import com.kiwi.livescore.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public Optional<Region> getRegion(int id) {
        return regionRepository.findById(id);

    }
}
