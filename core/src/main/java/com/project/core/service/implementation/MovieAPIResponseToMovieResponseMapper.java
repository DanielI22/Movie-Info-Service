package com.project.core.service.implementation;

import com.project.api.model.MovieResponse;
import com.project.core.data.externalmodel.MovieAPIResponse;
import org.springframework.stereotype.Service;

@Service
public class MovieAPIResponseToMovieResponseMapper {
    public MovieResponse mapResponse(MovieAPIResponse movieAPIResponse) {
        return MovieResponse.builder()
                .title(movieAPIResponse.title)
                .description(movieAPIResponse.overview)
                .genre(movieAPIResponse.genres.get(0).getName())
                .rating(movieAPIResponse.vote_average)
                .releaseDate(movieAPIResponse.release_date)
                .build();
    }
}
