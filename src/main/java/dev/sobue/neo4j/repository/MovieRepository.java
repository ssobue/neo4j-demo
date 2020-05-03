package dev.sobue.neo4j.repository;

import dev.sobue.neo4j.entity.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {

    Movie getMovieByTitle(String title);

    Iterable<Movie> findMovieByTitleLike(String title);
}
