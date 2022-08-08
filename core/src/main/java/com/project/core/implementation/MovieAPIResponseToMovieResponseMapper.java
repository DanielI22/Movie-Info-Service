package com.project.core.implementation;

import com.project.api.model.MovieResponse;
import com.project.data.externalmodel.MovieAPIResponse;
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
