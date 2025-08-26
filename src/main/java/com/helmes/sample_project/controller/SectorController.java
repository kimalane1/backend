package com.helmes.sample_project.controller;

import com.helmes.sample_project.dto.SectorDto;
import com.helmes.sample_project.service.SectorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/sectors")
public class SectorController {
    private final SectorService sectorService;

    public SectorController(SectorService sectorService) {
        this.sectorService = sectorService;
    }

    @GetMapping
    public List<SectorDto> getAll() {
        return sectorService.getAllSectors();
    }
}
