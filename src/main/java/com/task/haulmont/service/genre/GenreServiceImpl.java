package com.task.haulmont.service.genre;

import com.task.haulmont.dao.genre.GenreDao;
import com.task.haulmont.entity.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {
    @Autowired
    GenreDao genreDao;
    public List<Genre> findAll() {
        return genreDao.findAll();
    }
//
//    public Integer countBook(Genre genre) {
//        return null;
//    }

    public void save(Genre genre) {
        genreDao.save(genre);
    }

    public void update(Genre genre) {
        genreDao.update(genre);
    }

    public void delete(Long id) {
        genreDao.delete(id);
    }

    public Genre getById(Long id) {
        return genreDao.getById(id);
    }
}
