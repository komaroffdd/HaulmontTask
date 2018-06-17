package com.task.haulmont.service.book;

import com.task.haulmont.dao.book.BookDao;
import com.task.haulmont.entity.Author;
import com.task.haulmont.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDao bookDao;

    public List<Book> findAll() {
        return bookDao.findAll();
    }

    public List<Book> countBook(String genre) {
        return bookDao.countBook(genre);
    }

    public List<Book> findBookByAuthor(Author author) {
        return bookDao.findBookByAuthor(author);
    }

    public List<Book> findBookByName(String bookName) {
        return bookDao.findBookByName(bookName);
    }

    public List<Book> findBookByPublisher(String publisher) {
        return bookDao.findBookByPublisher(publisher);
    }

    public void save(Book book) {
        bookDao.save(book);
    }

    public void update(Book book) {
        bookDao.update(book);
    }

    public void delete(Long id) {
        bookDao.delete(id);
    }

    public Book getById(Long id) {
        return bookDao.getById(id);
    }
}
