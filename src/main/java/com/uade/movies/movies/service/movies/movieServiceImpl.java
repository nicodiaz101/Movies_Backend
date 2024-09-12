package com.uade.movies.movies.service.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uade.movies.movies.entity.movie;
import com.uade.movies.movies.repository.movieRepository;

@Service
public class movieServiceImpl implements movieService {

    @Autowired
    private movieRepository movieRepository;

    public List<movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

}
