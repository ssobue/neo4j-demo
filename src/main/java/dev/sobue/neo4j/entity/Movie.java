package dev.sobue.neo4j.entity;

import static org.neo4j.ogm.annotation.Relationship.INCOMING;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@NodeEntity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private int released;

    @Property("tagline")
    private String description;

    @JsonIgnoreProperties("movie")
    @Relationship(type = "ACTED_IN", direction = INCOMING)
    private List<Role> actors = List.of();

    @JsonIgnoreProperties({"actedIn", "directed"})
    @Relationship(type = "DIRECTED", direction = INCOMING)
    private List<Person> directors = List.of();
}
