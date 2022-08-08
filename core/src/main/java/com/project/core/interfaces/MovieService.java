package com.project.core.interfaces;

import com.project.api.model.MovieResponse;

public interface MovieService {
    MovieResponse getMovie(Long id);
}
