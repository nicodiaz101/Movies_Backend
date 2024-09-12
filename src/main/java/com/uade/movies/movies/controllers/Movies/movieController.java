package com.uade.movies.movies.controllers.Movies;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uade.movies.movies.entity.movies;
import com.uade.movies.movies.entity.dto.moviesRequest;
import com.uade.movies.movies.exceptions.CategoryDuplicateException;
import com.uade.movies.movies.service.movies.movieServiceImpl;



@RestController
@RequestMapping("movies")
public class movieController {
    @Autowired
    private movieServiceImpl movieService;

    @GetMapping
    public ResponseEntity<List<movies>> getAllMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<movies> getMovieById(Long id) {
        Optional<movies> result = movieService.getMovieById(id);
        if (result.isPresent()) {
            return ResponseEntity.ok(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<movies> createMovie(@RequestBody moviesRequest movieRequest) throws CategoryDuplicateException {
        movies result = movieService.createMovie(movieRequest.getTitle());
        return ResponseEntity.created(URI.create("/movies/" + result.getId())).body(result);
    }
    
}
