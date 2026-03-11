package hu.nyirszikszi.movie.controller;

import hu.nyirszikszi.movie.dto.MovieCreateRequest;
import hu.nyirszikszi.movie.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/movies")
public class MovieWebController {

    private final MovieService service;

    public MovieWebController(MovieService service) {
        this.service = service;
    }

    @GetMapping
    public String page(Model model,
                       @RequestParam(value = "success", required = false) String success,
                       @RequestParam(value = "error", required = false) String error) {

        model.addAttribute("movies", service.findAll());
        model.addAttribute("movieForm", new MovieCreateRequest());

        if (success != null) model.addAttribute("success", success);
        if (error != null) model.addAttribute("error", error);

        return "movies";
    }

    @PostMapping
    public String create(@ModelAttribute("movieForm") MovieCreateRequest form,
                         RedirectAttributes ra) {
        try {
            service.create(form);
            ra.addAttribute("success", "Film sikeresen hozzáadva.");
            return "redirect:/movies";
        } catch (IllegalArgumentException ex) {
            ra.addAttribute("error", ex.getMessage());
            return "redirect:/movies";
        }
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes ra) {
        try {
            service.delete(id);
            ra.addAttribute("success", "Film törölve.");
            return "redirect:/movies";
        } catch (IllegalArgumentException ex) {
            ra.addAttribute("error", ex.getMessage());
            return "redirect:/movies";
        }
    }
}
