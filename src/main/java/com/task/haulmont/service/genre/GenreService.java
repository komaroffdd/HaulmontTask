package com.task.haulmont.service.genre;

import com.task.haulmont.entity.Genre;

import java.util.List;

public interface GenreService {
    List<Genre> findAll();

//    Integer countBook(Genre genre);

    void save(Genre genre);

    void update(Genre genre);

    void delete(Long id);

    Genre getById(Long id);
}
