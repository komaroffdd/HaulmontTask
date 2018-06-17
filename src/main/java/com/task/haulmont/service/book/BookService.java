package com.task.haulmont.service.book;

import com.task.haulmont.entity.Author;
import com.task.haulmont.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    List<Book> countBook(String genre);

    List<Book> findBookByAuthor(Author author);

    List<Book> findBookByName(String bookName);

    List<Book> findBookByPublisher(String publisher);//??

    void save(Book book);

    void update(Book book);

    void delete(Long id);

    Book getById(Long id);
}
