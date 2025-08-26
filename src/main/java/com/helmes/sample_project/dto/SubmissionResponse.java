package com.helmes.sample_project.dto;

import java.util.List;

public record SubmissionResponse(
    Long id,
    String name,
    boolean agree,
    List<Integer> sectorIds
) {}
