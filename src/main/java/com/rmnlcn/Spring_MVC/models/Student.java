package com.rmnlcn.Spring_MVC.models;

import com.rmnlcn.Spring_MVC.validations.StudentCode;
import jakarta.validation.constraints.*;

import java.util.List;

public class Student {

    // fields
    @Pattern(regexp = "^[a-zA-Z]{2,25}", message = "only 25 chars")
    @NotNull(message = "is required")
    @Size(min = 2, message = "First name is required and must have 2 letters min")
    private String firstName;

    @Pattern(regexp = "^[a-zA-Z]{3,25}", message = "only 25 chars")
    @NotNull(message = "is required")
    @Size(min = 3, message = "Last name is required and must have 3 letters min")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 17, message = "must be greater than or equal to 17")
    @Max(value = 35, message = "must be less than or equal to 35")
    private Integer age;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    @StudentCode(value="STUDENT", message="must start with STUDENT prefix")
    private String studentCode;

    private String country;

    private String study;

    private String favoriteLanguage;

    private List<String> favoriteOperatingSystems;


    // constructors
    public Student() {}

    public Student(String firstName, String lastName, Integer age, String postalCode, String studentCode, String country, String study, String favoriteLanguage, List<String> favoriteOperatingSystems) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.postalCode = postalCode;
        this.studentCode = studentCode;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
}
