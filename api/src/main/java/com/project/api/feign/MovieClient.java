package com.project.api.feign;

import com.project.api.model.MovieResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "MOVIE-SERVICE", url = "http://localhost:8090")
public interface MovieClient {
    @RequestMapping(method = RequestMethod.GET, value = "/movie/")
    MovieResponse getMovie(@RequestParam Long movieId);
}
