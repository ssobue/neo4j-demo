package dev.sobue.neo4j.service;

import dev.sobue.neo4j.entity.Movie;

public interface MovieService {

    Movie getMovieByName(String title);
}
