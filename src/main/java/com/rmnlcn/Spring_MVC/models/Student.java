package com.rmnlcn.Spring_MVC.models;

public class Student {

    // fields
    private String firstName;

    private String lastName;

    private int age;

    private String country;

    private String study;

    private String favoriteLanguage;

    // constructors
    public Student() {}

    public Student(String firstName, String lastName, int age, String country, String study, String favoriteLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.study = study;
        this.favoriteLanguage = favoriteLanguage;
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
}
