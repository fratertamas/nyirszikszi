package hu.nyirszikszi.jpah2demo.controller;

import hu.nyirszikszi.jpah2demo.service.StudentService;
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
        return "students/list";  // templates/students/list.html
    }

    
}
