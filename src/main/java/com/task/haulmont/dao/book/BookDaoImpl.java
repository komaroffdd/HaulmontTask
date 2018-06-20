package com.task.haulmont.dao.book;

import com.task.haulmont.entity.Author;
import com.task.haulmont.entity.Book;
import com.task.haulmont.mapper.BookMapper;
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
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //    public List<Book> findAll() {
//        String sql = "SELECT book.book_title,author.first_name,author.last_name," +
//                "author.patronymic," +
//                "book.publisher,book.year,book.city " +
//                "FROM book INNER JOIN author on book.author_id=author.id";
//        return jdbcTemplate.query(sql, new BookMapper());
//    }
//    public void save(Book book) {
//        String sql = "INSERT INTO book (book_title, author_id, genre_id, publisher, city) VALUE (?,?,?,?,?)";
//        jdbcTemplate.update(sql, book.getName_book(), book.getAuthor(), book.getGenre(),
//                book.getPublisher(), book.getCity());
//    }

    public List<Book> findAll() {
        final String sql = "SELECT * FROM book";
        return jdbcTemplate.query(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                return connection.prepareStatement(sql);
            }
        }, new BookMapper());
    }
//    public List<Book> findAll() {
//        final String sql = "SELECT book.book_title,book.author_id,book.genre_id, book.publisher,book.city " +
//                "FROM book INNER JOIN author on book.author_id=author.id ";
//        return jdbcTemplate.query(new PreparedStatementCreator() {
//            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
//                return connection.prepareStatement(sql);
//            }
//        }, new BookMapper());
//    }

    public List<Book> findBookByAuthor(Author author) {
        String sql = "SELECT book.name_book,book.author,book.genre, book.publisher,book.city " +
                "FROM book INNER JOIN author on book.author=author.id " +
                "WHERE author.id= ?";
        return jdbcTemplate.query(sql, new BookMapper(), author.getId());
    }

    public List<Book> findBookByName(String bookName) {
        String sql = "SELECT book.name_book,author.first_name,author.last_name," +
                "author.patronymic," +
                "book.publisher,book.city " +
                "FROM book INNER JOIN author on book.author=author.id " +
                "WHERE book.name_book=?";
        return jdbcTemplate.query(sql, new BookMapper(), bookName);
    }

    public List<Book> countBook(String genre) {
        String sql = "SELECT count(*) FROM book INNER JOIN genre on book.genre=genre.id where genre.genre =?";
        return jdbcTemplate.query(sql, new BookMapper(), genre);
    }

    public List<Book> findBookByPublisher(final String publisher) {
        final String sql = "SELECT book.name_book,author.first_name,author.last_name," +
                "author.patronymic," +
                "book.publisher,book.city " +
                "FROM book INNER JOIN author on book.author=author.id " +
                "WHERE book.publisher=?";
        return jdbcTemplate.query(sql, new BookMapper(), publisher);
    }

    public void save(final Book book) {
        final String sql = "INSERT INTO book (name_book, author, genre, publisher, city) VALUE (?,?,?,?,?)";
        jdbcTemplate.update(sql, new PreparedStatementSetter() {
            public void setValues(PreparedStatement values) throws SQLException {
                values.setString(1, book.getName_book());
                values.setInt(2, book.getAuthor());
                values.setInt(3, book.getGenre());
                values.setString(4, book.getPublisher());
                values.setString(5, book.getCity());
            }
        });
    }

    public void update(final Book book) {
        final String sql = "UPDATE book SET name_book = ?, author=?,genre=?, publisher=?,city=? WHERE id =?";
        jdbcTemplate.update(sql, new PreparedStatementSetter() {
            public void setValues(PreparedStatement values) throws SQLException {
                values.setString(1, book.getName_book());
                values.setInt(2, book.getAuthor());
                values.setInt(3, book.getGenre());
                values.setString(4, book.getPublisher());
                values.setString(5, book.getCity());
                values.setLong(6, book.getId());
            }
        });
    }

    public void delete(final Long id) {
        final String sql = "DELETE FROM book where id=?";
        jdbcTemplate.update(sql, new PreparedStatementSetter() {
            public void setValues(PreparedStatement values) throws SQLException {
                values.setLong(1, id);
            }
        });
    }

    public Book getById(Long id) {
        String sql = "SELECT * FROM book WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new BookMapper(), id);
    }
}
