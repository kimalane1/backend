package com.helmes.sample_project.service;

import com.helmes.sample_project.dto.SectorDto;
import com.helmes.sample_project.model.Sector;
import com.helmes.sample_project.persistence.SectorRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SectorService {
    private final SectorRepository sectorRepository;

    public SectorService(SectorRepository sectorRepository) {
        this.sectorRepository = sectorRepository;
    }

    public List<SectorDto> getAllSectors() {
        List<Sector> all = sectorRepository.findAll();
        return buildTree(all);
    }

    private List<SectorDto> buildTree(List<Sector> sectors) {
        Map<Integer, SectorDto> map = new HashMap<>();
        sectors.forEach(sector -> map.put(sector.getId(), SectorDto.fromEntity(sector)));

        List<SectorDto> roots = new ArrayList<>();
        sectors.forEach(sector -> {
            SectorDto dto = map.get(sector.getId());
            if (sector.getParentId() == null) {
                roots.add(dto);
                return;
            }

            SectorDto parent = map.get(sector.getParentId());
            if (parent != null) parent.children().add(dto);

        });

        return roots;
    }

}
