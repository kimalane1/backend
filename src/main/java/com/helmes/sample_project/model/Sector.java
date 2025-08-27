package com.helmes.sample_project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sector")
public class Sector {
    @Id
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "created_date")
    private LocalDateTime createdDate;
}