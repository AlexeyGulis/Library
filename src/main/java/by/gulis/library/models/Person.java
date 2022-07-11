package by.gulis.library.models;

import javax.validation.constraints.*;

public class Person {
    private int person_id;
    @NotEmpty(message = "ФИО не должно быть пустым")
    @Pattern(regexp = "[A-Z]\\w+ [A-Z]\\w+ [A-Z]\\w*", message = "ФИО должно быть формата(Фамилия Имя Отчество)")
    @Size(min = 5, max = 200, message = "ФИО не должно быть больше чем 200 символов и меньше чем 5")
    private String fio;
    @Min(value = 1900, message = "Год рождения должен быть больше чем 1900")
    private int year_of_birth;

    public Person() {
    }

    public Person(int person_id, String fio, int year_of_birth) {
        this.person_id = person_id;
        this.fio = fio;
        this.year_of_birth = year_of_birth;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }
}
