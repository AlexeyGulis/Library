package by.gulis.library.models;

import javax.validation.constraints.*;

public class Person {
    private int id;
    @NotEmpty(message = "ФИО не должно быть пустым")
    @Pattern(regexp = "[A-Z]\\w+ [A-Z]\\w+ [A-Z]\\w*", message = "ФИО должно быть формата(Фамилия Имя Отчество)")
    @Size(min = 5, max = 200, message = "ФИО не должно быть больше чем 200 символов и меньше чем 5")
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
