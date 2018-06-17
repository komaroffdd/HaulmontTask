package com.task.haulmont.dao.genre;

import com.task.haulmont.entity.Genre;
import com.task.haulmont.mapper.GenreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class GenreDaoImpl implements GenreDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    public List<Genre> findAll() {
//        String sql = "SELECT * FROM genre";
////        PreparedStatementCreator sql = ;
//        return jdbcTemplate.query(sql, new GenreMapper());
//    }

//    public Integer countBook(Genre genre) {
//
//        String sql = "SELECT count(book.genre_id) FROM book where id = (SELECT id FROM genre);
//        return jdbcTemplate.query(sql, new GenreMapper());
//    }

    public List<Genre> findAll() {
        final String sql = "SELECT * FROM genre";
        return jdbcTemplate.query(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                return connection.prepareStatement(sql);
            }
        }, new GenreMapper());
    }

    public void save(final Genre genre) {
        final String sql = "INSERT INTO genre (genre) VALUE (?)";
        jdbcTemplate.update(sql, new PreparedStatementSetter() {
            public void setValues(PreparedStatement values) throws SQLException {
                    values.setString(1, genre.getGenre());
//                    values.executeUpdate();
//                    values.close();

            }
        });
    }

    public void update(final Genre genre) {
        final String sql = "UPDATE genre SET genre = ? WHERE id =?";
        jdbcTemplate.update(sql, new PreparedStatementSetter() {
            public void setValues(PreparedStatement values) throws SQLException {
                    values.setString(1, genre.getGenre());
                    values.setLong(2, genre.getId());
//                    values.executeUpdate();
//                    values.close();

            }
        });
    }

    public void delete(final Long id) {
        final String sql = "DELETE FROM genre where id=?";
        jdbcTemplate.update(sql, new PreparedStatementSetter() {
            public void setValues(PreparedStatement values) throws SQLException {

                    values.setLong(1,id);
//                    values.executeUpdate();
//                    values.close();

            }
        });
    }

    public Genre getById(Long id) {
        String sql = "SELECT * FROM genre WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new GenreMapper(), id);
    }
}
