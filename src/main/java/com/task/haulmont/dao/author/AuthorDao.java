package com.task.haulmont.dao.author;

import com.task.haulmont.entity.Author;

import java.util.List;

public interface AuthorDao {
    List<Author> findAll();

    Author getById(Long id);

    void save(Author author);

    void update(Author author);

    void delete(Long id);
}
