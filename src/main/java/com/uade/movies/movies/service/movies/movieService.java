package com.uade.movies.movies.service.movies;

import java.util.List;
import java.util.Optional;

import com.uade.movies.movies.entity.movie;

public interface movieService {
    public List<movie> getAllMovies();
    public Optional<movie> getMovieById(Long id);
}
