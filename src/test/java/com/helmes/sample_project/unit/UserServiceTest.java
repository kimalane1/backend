package com.helmes.sample_project.unit;


import com.helmes.sample_project.dto.SubmissionRequest;
import com.helmes.sample_project.dto.SubmissionResponse;
import com.helmes.sample_project.exception.UserNotFoundException;
import com.helmes.sample_project.model.AppUser;
import com.helmes.sample_project.model.Sector;
import com.helmes.sample_project.persistence.AppUserRepository;
import com.helmes.sample_project.persistence.SectorRepository;
import com.helmes.sample_project.service.SubmissionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private AppUserRepository userRepository;

    @Mock
    private SectorRepository sectorRepository;

    @InjectMocks
    private SubmissionService submissionService;

    @Test
    void saveSubmission_createsNewUser_whenNotExists() {
        SubmissionRequest req = new SubmissionRequest("Alice", true, List.of(1, 2));

        when(userRepository.findByName("Alice")).thenReturn(Optional.empty());
        when(sectorRepository.findAllById(List.of(1,2)))
                .thenReturn(List.of(new Sector(1, "IT", null, LocalDateTime.now()), new Sector(2, "Finance", null, LocalDateTime.now())));
        when(userRepository.save(any(AppUser.class))).thenAnswer(inv -> inv.getArgument(0));

        AppUser saved = submissionService.saveSubmission(req);

        assertEquals("Alice", saved.getName());
        assertTrue(saved.isAgreeTerms());
        assertEquals(2, saved.getSectors().size());
        verify(userRepository).save(any(AppUser.class));
    }

    @Test
    void getSubmission_throwsException_whenNotFound() {
        when(userRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(UserNotFoundException.class,
                () -> submissionService.getSubmission(99L));
    }

    @Test
    void updateSubmission_updatesUserCorrectly() {
        AppUser user = new AppUser();
        user.setId(1L);
        user.setName("Old");
        user.setAgreeTerms(false);

        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        when(sectorRepository.findAllById(List.of(10)))
                .thenReturn(List.of(Sector.builder().name("Printing").id(10).createdDate(LocalDateTime.now()).build()));
        when(userRepository.save(any(AppUser.class))).thenAnswer(inv -> inv.getArgument(0));


        SubmissionRequest req = new SubmissionRequest("New", true, List.of(10));
        SubmissionResponse resp = submissionService.updateSubmission(1L, req);

        assertEquals("New", resp.name());
        assertTrue(resp.agree());
        assertEquals(List.of(10), resp.sectorIds());
    }
}
