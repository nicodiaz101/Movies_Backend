package com.uade.movies.movies.controllers.Movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uade.movies.movies.entity.movie;
import com.uade.movies.movies.service.movies.movieServiceImpl;


@RestController
@RequestMapping("/movies")
public class movieController {
    @Autowired
    private movieServiceImpl movieService;

    @GetMapping
    public ResponseEntity<List<movie>> getAllMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<movie> getMovieById(Long id) {
        Optional<movie> result = movieService.getMovieById(id);
        if (result.isPresent()) {
            return ResponseEntity.ok(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
