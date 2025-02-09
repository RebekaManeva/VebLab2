package veb_labs.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Event {
    private Long id;
    private String name;
    private String description;
    private double popularityScore;
    private Location location;

    public Event(String name, String description, double popularityScore, Location location) {
        this.id = (long) (Math.random() * 1000);
        this.name = name;
        this.description = description;
        this.popularityScore = popularityScore;
        this.location = location;
    }
}
