package com.uade.movies.movies.service.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uade.movies.movies.entity.movies;
import com.uade.movies.movies.exceptions.CategoryDuplicateException;
import com.uade.movies.movies.repository.movieRepository;

@Service
public class movieServiceImpl implements movieService {

    @Autowired
    private movieRepository movieRepository;

    public List<movies> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<movies> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    public movies createMovie (String title) throws CategoryDuplicateException {
        List<movies> movies = movieRepository.findAll();
        if (movies.stream().anyMatch(
                movie -> movie.getTitle().equals(title))) {
            throw new CategoryDuplicateException();
        }
        return movieRepository.save(new movies(title));
    }

}
