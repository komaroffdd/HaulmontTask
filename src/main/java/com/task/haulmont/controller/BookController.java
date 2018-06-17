package com.task.haulmont.controller;

import com.task.haulmont.entity.Author;
import com.task.haulmont.entity.Book;
import com.task.haulmont.service.author.AuthorService;
import com.task.haulmont.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public String get(){
        return "redirect:/book/list";
    }
    @GetMapping("/list")
    public String getAllBook(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "/book/list";
    }

    @GetMapping("/add")
    public String createBookPage() {
        return "/book/createBook";
    }

//    @PostMapping("/add")
//    public String add(@ModelAttribute("book") @Valid Book book, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "book/error";
//        }
//        bookService.save(book);
//        return "redirect:/book/list";
//    }
    @PostMapping("/add")
    public String add(@ModelAttribute("book") @Valid Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "book/error";
        }
        bookService.save(book);
        return "redirect:/book/list";
    }

//    @PostMapping("/add")
//    public String add(@ModelAttribute("book")@Valid Book book) throws Exception {
//        bookService.save(book);
//        return "redirect:/book/list";
//    }

    @PostMapping("/update")
    public String updateAuthor(@ModelAttribute("book") @Valid Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "book/error";
        }
        bookService.update(book);
        return "redirect:/book/list";
    }

    @GetMapping("update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        model.addAttribute("book", bookService.getById(id));
        return "/book/editBook";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        bookService.delete(id);
        return "redirect:/book/list";
    }

    @GetMapping("/error")
    public String error() {
        return "/book/error";
    }

    @GetMapping("/count/{genre}")
    public String count(@PathVariable("genre") String genre,Model model){
        model.addAttribute("count",bookService.countBook(genre));
        return "book/genre";
    }

    @GetMapping("/publisher/{publisher}")
    public String findByPublisher(@PathVariable("publisher") String publisher, Model model) {
        model.addAttribute("publisher", bookService.findBookByPublisher(publisher));
        return "book/publisherList";
    }
    @PostMapping("/publisher")
    public String publisher(@NotNull String publisher){
        bookService.findBookByPublisher(publisher);
        return "book/publisherList";
    }

    @GetMapping("/bookNameList/{bookName}")
    public String findByBookName(@PathVariable("bookName") String bookName, Model model) {
        model.addAttribute("bookName", bookService.findBookByName(bookName));
        return "/book/bookNameList";
    }
    //        return "/book/bookAuthorList";
    //        model.addAttribute("bookName",bookService.findBookByAuthor(author));
    //    public String findByAuthor(@PathVariable("author") Author author, Model model){
//    @GetMapping("/{author}")

//    }
}