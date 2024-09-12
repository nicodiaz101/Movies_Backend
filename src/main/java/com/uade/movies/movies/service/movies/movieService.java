package com.uade.movies.movies.service.movies;

import java.util.List;
import java.util.Optional;

import com.uade.movies.movies.entity.movies;

public interface movieService {
    public List<movies> getAllMovies();
    public Optional<movies> getMovieById(Long id);
}
