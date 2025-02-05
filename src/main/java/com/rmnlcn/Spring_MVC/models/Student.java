package com.rmnlcn.Spring_MVC.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Student {

    // fields
    @NotNull(message = "is required")
    @Size(min = 2, message = "First name is required and must have 2 letters min")
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 3, message = "Last name is required and must have 3 letters min")
    private String lastName;

    private int age;

    private String country;

    private String study;

    private String favoriteLanguage;

    private List<String> favoriteOperatingSystems;


    // constructors
    public Student() {}

    public Student(String firstName, String lastName, int age, String country, String study, String favoriteLanguage, List<String> favoriteOperatingSystems) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.study = study;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteOperatingSystems = favoriteOperatingSystems;
    }

    // getters / setters
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public List<String> getFavoriteOperatingSystems() {
        return favoriteOperatingSystems;
    }

    public void setFavoriteOperatingSystems(List<String> favoriteOperatingSystems) {
        this.favoriteOperatingSystems = favoriteOperatingSystems;
    }
}
