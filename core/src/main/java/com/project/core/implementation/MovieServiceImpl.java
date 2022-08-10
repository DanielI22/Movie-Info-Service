package com.project.core.implementation;

import com.project.core.exception.MovieNotFoundException;
import com.project.api.model.MovieResponse;
import com.project.core.interfaces.MovieService;
import com.project.data.externalmodel.MovieAPIResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class MovieServiceImpl implements MovieService {
    @Value("${apiKey}")
    private String apiKey;

    private final RestTemplate restTemplate;
    private final MovieAPIResponseToMovieResponseMapper movieAPIResponseToMovieResponseMapper;

    public MovieServiceImpl(RestTemplate restTemplate, MovieAPIResponseToMovieResponseMapper movieAPIResponseToMovieResponseMapper) {
        this.restTemplate = restTemplate;
        this.movieAPIResponseToMovieResponseMapper = movieAPIResponseToMovieResponseMapper;
    }

    @Override
    public MovieResponse getMovie(Long movieId) {
        String url = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey;
        try {
            return movieAPIResponseToMovieResponseMapper.mapResponse(Objects.requireNonNull(restTemplate
                    .getForObject(url, MovieAPIResponse.class)));
        }
        catch (Exception e) {
            throw new MovieNotFoundException();
        }
    }
}
