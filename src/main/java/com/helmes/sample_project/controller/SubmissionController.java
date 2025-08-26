package com.helmes.sample_project.controller;

import com.helmes.sample_project.dto.SubmissionRequest;
import com.helmes.sample_project.dto.SubmissionResponse;
import com.helmes.sample_project.model.AppUser;
import com.helmes.sample_project.service.SubmissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/submissions")
@RequiredArgsConstructor
public class SubmissionController {

    private final SubmissionService submissionService;

    @PostMapping
    public ResponseEntity<AppUser> save(@RequestBody SubmissionRequest request) {
        AppUser saved = submissionService.saveSubmission(request);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubmissionResponse> get(@PathVariable Long id) {
        return ResponseEntity.ok(submissionService.getSubmission(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SubmissionResponse> update(
            @PathVariable Long id,
            @RequestBody SubmissionRequest req
    ) {
        return ResponseEntity.ok(submissionService.updateSubmission(id, req));
    }
}