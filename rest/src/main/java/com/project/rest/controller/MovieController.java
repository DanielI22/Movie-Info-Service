package com.project.rest.controller;

import com.project.api.model.MovieResponse;
import com.project.core.interfaces.MovieService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movie/")
    public MovieResponse getMovie(@RequestParam Long movieId) {
        return movieService.getMovie(movieId);
    }
}
