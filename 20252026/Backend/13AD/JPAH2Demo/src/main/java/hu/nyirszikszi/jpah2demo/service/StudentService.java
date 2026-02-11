package hu.nyirszikszi.jpah2demo.service;

import hu.nyirszikszi.jpah2demo.model.Student;
import hu.nyirszikszi.jpah2demo.model.StudentCreateRequest;
import hu.nyirszikszi.jpah2demo.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> findAll() {
        return repo.findAll();
    }

    public Student findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Nincs ilyen diák: " + id));
    }

    @Transactional
    public Student create(StudentCreateRequest request) {
        repo.findByEmail(request.email()).ifPresent(s -> {
            throw  new IllegalArgumentException("Ezzel az e-mail címmel már van diák: " + request.email());
        });

        return repo.save(new Student(request.name(), request.email()));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }


}
