package hu.nyirszikszi.movie.service;

import hu.nyirszikszi.movie.dto.MovieCreateRequest;
import hu.nyirszikszi.movie.entity.Movie;
import hu.nyirszikszi.movie.repository.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository repo;

    public MovieService(MovieRepository repo) {
        this.repo = repo;
    }

    public List<Movie> findAll() {
        return repo.findAll();
    }

    @Transactional
    public Movie create(MovieCreateRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("Request body is missing");
        }
        if (isNullOrBlank(request.getTitle())) {
            throw new IllegalArgumentException("title is required");
        }
        if (isNullOrBlank(request.getDirector())) {
            throw new IllegalArgumentException("director is required");
        }
        if (isNullOrBlank(request.getImdbId())) {
            throw new IllegalArgumentException("imdbId is required");
        }

        String imdbId = request.getImdbId().trim();

        repo.findByImdbId(imdbId).ifPresent(m -> {
            throw new IllegalArgumentException("imdbId already exists: " + imdbId);
        });

        Movie m = new Movie();
        m.setTitle(request.getTitle().trim());
        m.setDirector(request.getDirector().trim());
        m.setImdbId(imdbId);

        return repo.save(m);
    }

    @Transactional
    public void delete(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
        if (!repo.existsById(id)) {
            throw new IllegalArgumentException("Movie not found: " + id);
        }
        repo.deleteById(id);
    }

    private static boolean isNullOrBlank(String s) {
        return s == null || s.trim().isEmpty();
    }
}
