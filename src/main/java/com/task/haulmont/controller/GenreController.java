package com.task.haulmont.controller;

import com.task.haulmont.entity.Author;
import com.task.haulmont.entity.Genre;
import com.task.haulmont.service.book.BookService;
import com.task.haulmont.service.genre.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/genre")
public class GenreController {
    @Autowired
    private GenreService genreService;
    @Autowired
    private BookService bookService;

    @GetMapping
    public String get(){
        return "redirect:/genre/list";
    }

    @GetMapping("/list")
    public String getAllGenre(Model model) {
        model.addAttribute("genres", genreService.findAll());
        return "genre/list";
    }
    @GetMapping("/{id}")
    public String getById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("genre", genreService.getById(id));
        model.addAttribute("books",bookService.findAll());
        return "genre/showGenre";
    }
    @GetMapping("/add")
    public String createGenrePage()
    {
        return "/genre/createGenre";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("genre") @Valid Genre genre,BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/genre/error";
        }
        genreService.save(genre);
        return "redirect:/genre/list";
    }
    @PostMapping("/update")
    public String updateGenre(@ModelAttribute("genre")@Valid Genre genre,BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "genre/error";
        }
        genreService.update(genre);
        return "redirect:/genre/list";
    }

    @GetMapping("update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        model.addAttribute("genre",genreService.getById(id));
        return "genre/editGenre";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        genreService.delete(id);
        return "redirect:/genre/list";
    }
    @GetMapping("/error")
    public String error() {
        return "genre/error";
    }
}
