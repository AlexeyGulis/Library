package by.gulis.library.dao;

import by.gulis.library.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BookDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> index() {
        return jdbcTemplate.query("SELECT * FROM Book", new BeanPropertyRowMapper<>(Book.class));
    }

    public Book show(int id) {
        return jdbcTemplate.query("SELECT * FROM Book WHERE book_id=?",
                new Object[]{id},
                new BeanPropertyRowMapper<>(Book.class)).stream().findAny().orElse(null);
    }

    public void save(Book book) {
        jdbcTemplate.update("INSERT INTO Book(name_of_book,author_of_the_book,year_of_book) VALUES(?,?,?)",
                book.getName_of_book(), book.getAuthor_of_the_book(),book.getYear_of_book());
    }

    public void update(int id, Book book) {
        jdbcTemplate.update("UPDATE Book SET name_of_book=?, author_of_the_book=?,year_of_book=? WHERE book_id=?",
                book.getName_of_book(),book.getAuthor_of_the_book(),book.getYear_of_book(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM Book WHERE book_id=?", id);
    }
}
