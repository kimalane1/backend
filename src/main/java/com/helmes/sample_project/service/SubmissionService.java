package com.helmes.sample_project.service;

import com.helmes.sample_project.dto.SubmissionRequest;
import com.helmes.sample_project.dto.SubmissionResponse;
import com.helmes.sample_project.model.AppUser;
import com.helmes.sample_project.model.Sector;
import com.helmes.sample_project.persistence.AppUserRepository;
import com.helmes.sample_project.persistence.SectorRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubmissionService {

    private final AppUserRepository userRepository;
    private final SectorRepository sectorRepository;

    @Transactional
    public AppUser saveSubmission(SubmissionRequest request) {
        return userRepository.findByName(request.name())
                .map(user -> {
                    user.setAgreeTerms(request.agree());
                    user.setSectors(sectorRepository.findAllById(request.sectorIds()));
                    return userRepository.save(user);
                })
                .orElseGet(() -> {
                    AppUser newUser = new AppUser();
                    newUser.setName(request.name());
                    newUser.setAgreeTerms(request.agree());
                    newUser.setSectors(sectorRepository.findAllById(request.sectorIds()));
                    return userRepository.save(newUser);
                });
    }


    @Transactional
    public SubmissionResponse getSubmission(Long id) {
        AppUser user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        List<Integer> sectorIds = user.getSectors()
                .stream()
                .map(Sector::getId)
                .toList();

        return new SubmissionResponse(
                user.getId(),
                user.getName(),
                user.isAgreeTerms(),
                sectorIds
        );
    }

    @Transactional
    public SubmissionResponse updateSubmission(Long id, SubmissionRequest req) {
        AppUser user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setName(req.name());
        user.setAgreeTerms(req.agree());

        List<Sector> sectors = sectorRepository.findAllById(req.sectorIds());
        user.setSectors(sectors);

        AppUser saved = userRepository.save(user);

        return new SubmissionResponse(
                saved.getId(),
                saved.getName(),
                saved.isAgreeTerms(),
                saved.getSectors().stream().map(Sector::getId).toList()
        );
    }
}
