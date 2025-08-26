package com.helmes.sample_project.dto;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public record SubmissionRequest(
    @NotNull String name,
    @NotNull boolean agree,
    @NotNull List<Integer> sectorIds
) {}