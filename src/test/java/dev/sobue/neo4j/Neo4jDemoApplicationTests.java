package dev.sobue.neo4j;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
@DisplayName("Application Launching Tests")
class Neo4jDemoApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Context Load Test")
    void contextLoads() {
        assertNotNull(context);
    }
}
