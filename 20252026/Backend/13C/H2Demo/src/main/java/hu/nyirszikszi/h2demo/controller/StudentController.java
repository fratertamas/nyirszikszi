package hu.nyirszikszi.h2demo.controller;

import hu.nyirszikszi.h2demo.model.Student;
import hu.nyirszikszi.h2demo.model.StudentCreateRequest;
import hu.nyirszikszi.h2demo.service.StudentService;
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
    
}
