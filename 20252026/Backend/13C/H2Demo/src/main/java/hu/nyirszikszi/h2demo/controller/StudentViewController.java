package hu.nyirszikszi.h2demo.controller;

import hu.nyirszikszi.h2demo.model.StudentCreateRequest;
import hu.nyirszikszi.h2demo.service.StudentService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentViewController {
    private final StudentService service;

    public StudentViewController(StudentService service) {
        this.service = service;
    }

    // Lista oldal
    @GetMapping
    public String list(Model model) {
        model.addAttribute("students", service.findAll());
        return "students/list"; // templates/students/list.html
    }

    // Új diák űrlap
    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("students", new StudentCreateRequest("", ""));
        return "students/new"; // templates/students/new.html
    }

    
}
