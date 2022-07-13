package by.gulis.library.dao;

import by.gulis.library.models.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setId(rs.getInt("book_id"));
        book.setPersonId(rs.getInt("person_id"));
        book.setName(rs.getString("name_of_book"));
        book.setAuthor(rs.getString("author_of_the_book"));
        book.setYear(rs.getInt("year_of_book"));
        return book;
    }
}
