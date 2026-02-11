package hu.nyirszikszi.jpah2demo.controller;

import hu.nyirszikszi.jpah2demo.model.Student;
import hu.nyirszikszi.jpah2demo.model.StudentCreateRequest;
import hu.nyirszikszi.jpah2demo.repository.StudentRepository;
import hu.nyirszikszi.jpah2demo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Student byId(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student create (@RequestBody StudentCreateRequest request) {
        return service.create(request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }


}
