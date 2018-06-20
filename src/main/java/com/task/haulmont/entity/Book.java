package com.task.haulmont.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Book {
    private Long id;

//    @NotNull
    @Size(min = 2, max = 30)
    private String name_book;

    @NotNull
//    @Size(min = 2, max = 30)
//    @Pattern(regexp = "[0-9]")
    private Integer author;

    @NotNull
//    @Size(min = 2, max = 30)
//    @Pattern(regexp = "[0-9]+")
    private Integer genre;

    @Size(min = 2, max = 30)
//    @NotNull
    private String publisher;

//    @Past
//    private Date year;

//    @NotNull
    @Size(min = 2, max = 30)
    private String city;

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getGenre() {
        return genre;
    }

    public void setGenre(Integer genre) {
        this.genre = genre;
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
