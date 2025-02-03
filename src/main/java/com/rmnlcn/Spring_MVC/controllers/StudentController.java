package com.rmnlcn.Spring_MVC.controllers;

import com.rmnlcn.Spring_MVC.models.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${studies}")
    private List<String> studies;

    // create method to show the form
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel) {

        // create student object
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent);

        // add list of countries to the model
        theModel.addAttribute("countries", countries);

        // add list of studies to the model
        theModel.addAttribute("studies", studies);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent) {

        // log the input data
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName() + " / Age: " + theStudent.getAge());

        return "student-confirmation";
    }
}
