package com.uade.movies.movies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uade.movies.movies.entity.movies;

@Repository
public interface movieRepository extends JpaRepository <movies, Long> {
    @Query(value = "SELECT c FROM movies c WHERE c.title = ?1")
    List<movies> findByTitle(String title);
}