package dev.sobue.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Launch Class.
 *
 * @author ssobue
 */
@SpringBootApplication
public class Neo4jDemoApplication {

    /**
     * Main Method.
     *
     * @param args Command Line Arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(Neo4jDemoApplication.class, args);
    }
}
