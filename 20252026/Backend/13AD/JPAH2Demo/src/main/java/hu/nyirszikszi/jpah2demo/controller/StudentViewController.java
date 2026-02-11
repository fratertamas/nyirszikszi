package hu.nyirszikszi.jpah2demo.controller;

import hu.nyirszikszi.jpah2demo.model.StudentCreateRequest;
import hu.nyirszikszi.jpah2demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    // Űrlap elküldése
    @PostMapping
    public String create(@ModelAttribute("student")StudentCreateRequest request) {
        service.create(request);
        return "redirect:/students";
    }

    // Törlés gomb (Post-tal, mert HTML form nem szereti a DELETE-t)
    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/students";
    }
}
