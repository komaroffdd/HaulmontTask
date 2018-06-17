package com.task.haulmont.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

public class Book {
    private Long id;

//    @NotNull
    @Size(min = 2, max = 30)
    private String book_title;

    @NotNull
//    @Size(min = 2, max = 30)
//    @Pattern(regexp = "[0-9]")
    private Integer author_id;

    @NotNull
//    @Size(min = 2, max = 30)
//    @Pattern(regexp = "[0-9]+")
    private Integer genre_id;

    @Size(min = 2, max = 30)
    @NotNull
    private String publisher;

//    @Past
//    private Date year;

    @NotNull
    @Size(min = 2, max = 30)
    private String city;

//    public Book(String book_title, Integer author_id, Integer genre_id) {
//        this.book_title = book_title;
//        this.author_id = author_id;
//        this.genre_id = genre_id;
//    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

//    public Date getYear() {
//        return year;
//    }
//
//    public void setYear(Date year) {
//        this.year = year;
//    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
