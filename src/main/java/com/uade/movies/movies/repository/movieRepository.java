package com.uade.movies.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uade.movies.movies.entity.movie;

@Repository
public interface movieRepository extends JpaRepository <movie, Long> {
    
}