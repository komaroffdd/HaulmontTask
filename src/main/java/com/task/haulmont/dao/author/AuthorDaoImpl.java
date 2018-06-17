package com.task.haulmont.dao.author;

import com.task.haulmont.entity.Author;
import com.task.haulmont.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Repository
public class AuthorDaoImpl implements AuthorDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    public void save(Author author) {
//        final String sql = "INSERT INTO author (first_name, last_name, patronymic) VALUE (?,?,?)";
//        jdbcTemplate.update(new PreparedStatementCreator() {
//            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
//                return connection.prepareStatement(sql);
//            }
//        }), author.getFirstName(), author.getLastName(), author.getPatronymic());
//    }

    public List<Author> findAll() {
        final String sql = "SELECT * FROM author";
        return jdbcTemplate.query(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                return connection.prepareStatement(sql);
            }
        }, new AuthorMapper());
    }

    public Author getById(final Long id) {
        final String sql = "SELECT * FROM author WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new AuthorMapper(), id);
    }

    public void save(final Author author) {
        final String sql = "INSERT INTO author (first_name, last_name, patronymic) VALUE (?,?,?)";
        jdbcTemplate.update(sql, new PreparedStatementSetter() {
            public void setValues(PreparedStatement values) throws SQLException {

                    values.setString(1, author.getFirstName());
                    values.setString(2, author.getLastName());
                    values.setString(3, author.getPatronymic());
//                    values.executeUpdate();
//                    values.close();

            }
        });
    }

    public void update(final Author author) {
        final String sql = "UPDATE author SET first_name=?, last_name=?, patronymic=? WHERE id=?";
        jdbcTemplate.update(sql, new PreparedStatementSetter() {
            public void setValues(PreparedStatement values) throws SQLException {

                    values.setString(1, author.getFirstName());
                    values.setString(2, author.getLastName());
                    values.setString(3, author.getPatronymic());
                    values.setLong(4, author.getId());
//                    values.executeUpdate();
//                    values.close();

            }
        });
    }
//
//    public void update(Author author) {
//        String sql = "UPDATE author SET first_name=?, last_name=?, patronymic=? WHERE id=?";
//        jdbcTemplate.update(sql, author.getFirstName(), author.getLastName(), author.getPatronymic(), author.getId());
//    }

    public void delete(final Long id) {
        final String sql = "DELETE FROM author where id=?";
        jdbcTemplate.update(sql, new PreparedStatementSetter() {
            public void setValues(PreparedStatement preparedStatement) throws SQLException {
                preparedStatement.setLong(1,id);
            }
        });
    }
}
