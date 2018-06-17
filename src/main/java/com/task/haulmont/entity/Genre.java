package com.task.haulmont.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Genre {
    private Long id;

    @NotNull
    @Size(min =2 , max = 30)
    private String genre;

//    public Genre(String genre) {
//        this.genre = genre;
//    }

    public Genre() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

}
