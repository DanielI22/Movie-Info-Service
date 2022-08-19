package com.project.core.interfaces;

import com.project.api.model.MovieResponse;

public interface MovieServiceProcessor {
    MovieResponse getMovie(Long id);
}
