package com.project.api.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class MovieResponse {
    private String title;
    private String description;
    private String genre;
    public String releaseDate;
    private Double rating;
}
