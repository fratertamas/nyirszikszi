package hu.nyirszikszi.movie.dto;

public class MovieCreateRequest {
    private String title;
    private String director;
    private String imdbId;

    public MovieCreateRequest() { }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public String getImdbId() { return imdbId; }
    public void setImdbId(String imdbId) { this.imdbId = imdbId; }
}
