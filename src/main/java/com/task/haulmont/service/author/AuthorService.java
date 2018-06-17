package com.task.haulmont.service.author;

import com.task.haulmont.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();

    void save(Author author) throws Exception;

    Author getById(Long id);

    void update(Author author);

    void delete(Long id);
}
