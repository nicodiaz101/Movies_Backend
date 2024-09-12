package com.uade.movies.movies.controllers.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movies")
public class movieController {
    @Autowired
    private MovieService movieService;
    
}
