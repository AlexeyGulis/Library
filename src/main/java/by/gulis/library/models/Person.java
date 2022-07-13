package by.gulis.library.models;

import javax.validation.constraints.*;

public class Person {
    private int id;
    @NotEmpty(message = "ФИО не должно быть пустым")
    @Pattern(regexp = "[A-ZА-Я](?U)\\w* [A-ZА-Я](?U)\\w*( [A-ZА-Я](?U)\\w*){0,1}",
            message = "Поле Автор должно быть формата(Фамилия Имя Отчество,где Отчество не обязательно")
    @Size(max = 200, message = "ФИО не должно быть больше чем 200 символов")
    private String fio;
    @Min(value = 1900, message = "Год рождения должен быть больше чем 1900")
    private int year;

    public Person() {
    }

    public Person(int id, String fio, int year) {
        this.id = id;
        this.fio = fio;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
