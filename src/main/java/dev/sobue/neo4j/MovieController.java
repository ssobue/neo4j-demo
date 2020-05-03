package dev.sobue.neo4j;

import dev.sobue.neo4j.entity.Movie;
import dev.sobue.neo4j.service.MovieService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movie")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Movie> getMovieByName(@RequestParam String title) {
        return Optional.ofNullable(service.getMovieByName(title))
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
