package com.kiwi.livescore.service;

import com.kiwi.livescore.model.Region;
import com.kiwi.livescore.repository.RegionRepository;
import com.kiwi.livescore.request.RegionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public Region getRegion(int id) {
        return regionRepository.findById(id);
    }

    public Region createRegion(@RequestBody RegionRequest regionRequest) {
        Region region = new Region();
        region.setName(regionRequest.getName());
        region.setSort(regionRequest.getSort());
        return regionRepository.save(region);
    }

    public List<Region> getRegions() {
        return regionRepository.findAll();
    }

    public Region updateRegion(int id, RegionRequest request) {
        Region region = regionRepository.findById(id);
        region.setName(request.getName());
        region.setSort(request.getSort());
        return regionRepository.save(region);
    }

    public void deleteRegion(int id) {
        regionRepository.deleteById(id);
    }
}
