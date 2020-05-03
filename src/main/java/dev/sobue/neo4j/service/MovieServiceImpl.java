package dev.sobue.neo4j.service;

import dev.sobue.neo4j.entity.Movie;
import dev.sobue.neo4j.repository.MovieRepository;
import dev.sobue.neo4j.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final PersonRepository personRepository;

    @Override
    public Movie getMovieByName(String title) {
        return movieRepository.getMovieByTitle(title);
    }
}
