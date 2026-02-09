package hu.nyirszikszi.h2demo.service;

import hu.nyirszikszi.h2demo.model.Student;
import hu.nyirszikszi.h2demo.model.StudentCreateRequest;
import hu.nyirszikszi.h2demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Nincs ilyen diák: " + id));
    }

    public Student create(StudentCreateRequest request) {
        repository.findByEmail(request.email()).ifPresent( s -> {
            throw new IllegalArgumentException("Ezzel az e-maillel már van diák: " + request.email());
        });

        return repository.save(new Student(request.name(), request.email()));
    }
}
