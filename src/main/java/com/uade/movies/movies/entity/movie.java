package com.uade.movies.movies.entity;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class movie {
    private long id;
    private String title;
}
