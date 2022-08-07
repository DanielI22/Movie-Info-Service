package com.project.core.service.interfaces;

import com.project.api.model.MovieResponse;

public interface MovieService {
    MovieResponse getMovie(Long id);
}
