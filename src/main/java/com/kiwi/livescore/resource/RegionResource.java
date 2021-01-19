package com.kiwi.livescore.resource;

import com.kiwi.livescore.model.Region;
import com.kiwi.livescore.request.RegionRequest;
import com.kiwi.livescore.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/regions")
public class RegionResource {

    @Autowired
    private RegionService regionService;

    @GetMapping("/{id}")
    public Region getRegion(@PathVariable int id) {
        return regionService.getRegion(id);
    }

    @GetMapping
    public List<Region> getRegions() {
        return regionService.getRegions();
    }

    @PostMapping
    public Region createRegion(@RequestBody RegionRequest regionRequest) {
        return regionService.createRegion(regionRequest);
    }

    @PutMapping("/{id}")
    public Region updateRegion(@PathVariable int id, @RequestBody RegionRequest request) {
        return regionService.updateRegion(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteRegion(@PathVariable int id) {
        regionService.deleteRegion(id);
    }
}
