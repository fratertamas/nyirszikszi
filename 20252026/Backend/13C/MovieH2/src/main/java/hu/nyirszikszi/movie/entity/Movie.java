package hu.nyirszikszi.movie.entity;

import jakarta.persistence.*;

@Entity
@Table(
        name = "movies",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_movies_imdb_id", columnNames = "imdbId")
        }
)
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String director;

    @Column(nullable = false, unique = true)
    private String imdbId;

    public Movie() { }

    public Movie(Long id, String title, String director, String imdbId) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.imdbId = imdbId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public String getImdbId() { return imdbId; }
    public void setImdbId(String imdbId) { this.imdbId = imdbId; }
}