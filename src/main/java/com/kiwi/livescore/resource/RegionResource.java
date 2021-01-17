package com.kiwi.livescore.resource;

import com.kiwi.livescore.model.Region;
import com.kiwi.livescore.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/regions")
public class RegionResource {

    @Autowired
    private RegionService regionService;

    @GetMapping("/{id}")
    public Optional<Region> getRegion(@PathVariable int id) {
        return regionService.getRegion(id);
    }
}
