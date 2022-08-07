package com.project.rest.config;

import com.project.api.exception.MovieNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return true;
    }

    @Override
    public void handleError(ClientHttpResponse httpResponse)
            throws IOException {
        if (httpResponse.getStatusCode() == HttpStatus.NOT_FOUND) {
            throw new MovieNotFoundException();
        }
    }
}
