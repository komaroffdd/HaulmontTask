package com.task.haulmont.service.author;

import com.task.haulmont.dao.author.AuthorDao;
import com.task.haulmont.dao.author.AuthorDaoImpl;
import com.task.haulmont.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorDao authorDao;


    public List<Author> findAll() {
        return authorDao.findAll();
    }

    public void save(Author author)  {
        authorDao.save(author);
    }

    public Author getById(Long id) {
        return authorDao.getById(id);
    }

    public void update(Author author) {
        authorDao.update(author);
    }

    public void delete(Long id) {
        authorDao.delete(id);
    }
}
