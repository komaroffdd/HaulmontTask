package com.task.haulmont.mapper;

import com.task.haulmont.entity.Genre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreMapper  implements RowMapper<Genre> {
    public Genre mapRow(ResultSet resultSet, int i) throws SQLException {
        Genre genre = new Genre();
        genre.setId(resultSet.getLong("id"));
        genre.setGenre(resultSet.getString("genre"));
        return genre;
    }
}
