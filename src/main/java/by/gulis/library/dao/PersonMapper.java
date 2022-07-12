package by.gulis.library.dao;


import by.gulis.library.models.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();
        person.setId(rs.getInt("person_id"));
        person.setFio(rs.getString("fio"));
        person.setYear(rs.getInt("year_of_birth"));
        return person;
    }
}
