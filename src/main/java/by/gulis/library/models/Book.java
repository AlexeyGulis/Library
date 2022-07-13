package by.gulis.library.models;

import javax.validation.constraints.*;
import java.time.YearMonth;

public class Book {
    private int id;
    private Integer personId;
    @NotEmpty(message = "Поле Название Книги не должно быть пустым")
    @Size(max = 200,
            message = "Поле Название Книги не должно быть больше чем 200 символов")
    private String name;
    @NotEmpty(message = "Поле Автор не должно быть пустым")
    @Pattern(regexp = "[A-ZА-Я](?U)\\w* [A-ZА-Я](?U)\\w*( [A-ZА-Я](?U)\\w*){0,1}",
            message = "Поле Автор должно быть формата(Фамилия Имя Отчество,где Отчество не обязательно")
    @Size(max = 200, message = "Поле Автор не должно быть больше чем 200 символов")
    private String author;
    @Min(value = 0, message = "Год книги не может быть отрицательным")
    private int year;

    public Book() {
    }

    public Book(int id, Integer personId, String name, String author, int year) {
        this.id = id;
        this.personId = personId;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
