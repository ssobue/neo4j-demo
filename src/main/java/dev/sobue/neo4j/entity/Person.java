package dev.sobue.neo4j.entity;

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
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Property("born")
    private int birthYear;

    @JsonIgnoreProperties("person")
    @Relationship(type = "ACTED_IN")
    private List<Role> actedIn = List.of();

    @JsonIgnoreProperties({"actors", "directors"})
    @Relationship(type = "DIRECTED")
    private List<Movie> directed = List.of();

}
