package com.uade.movies.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uade.movies.movies.entity.movie;

public interface movieRepository extends JpaRepository <movie, Long> {
    
}