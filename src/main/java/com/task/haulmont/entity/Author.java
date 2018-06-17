package com.task.haulmont.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Author {
    private Long id;

//    @NotNull
//    @Size(min = 2 , max = 40)
    private String firstName;

//    @NotNull
//    @Size(min = 2 , max = 40)
    private String lastName;

//    @NotNull
//    @Size(min = 2 , max = 40)
    private String patronymic;

    public Author() {
    }

//    public Author(String firstName, String lastName, String patronymic) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.patronymic = patronymic;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
