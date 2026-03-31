package com.example.springBootTutorial.dto;

import java.time.LocalDate;


public class EmoployeeDTO {

    private Long id;

    private String name;

    private String email;

    private Integer age;

    private LocalDate joiningDate;

    private Boolean isActive;

    public EmoployeeDTO() {
    }

    public EmoployeeDTO(Long id, String name, String email, Integer age, LocalDate joiningDate, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.joiningDate = joiningDate;
        this.isActive = isActive;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public Boolean isActive() {
        return isActive;
    }
}
