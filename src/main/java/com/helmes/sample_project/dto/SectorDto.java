package com.helmes.sample_project.dto;

import com.helmes.sample_project.model.Sector;

import java.util.ArrayList;
import java.util.List;

public record SectorDto(Integer id, String name, Integer parentId, List<SectorDto> children) {
    public static SectorDto fromEntity(Sector sector) {
        return new SectorDto(sector.getId(), sector.getName(), sector.getParentId(), new ArrayList<>());
    }
}
