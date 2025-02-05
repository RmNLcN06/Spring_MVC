package com.rmnlcn.Spring_MVC.controllers;

import com.rmnlcn.Spring_MVC.models.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

    @Value("${languages}")
    private List<String> languages;

    @Value("${systems}")
    private List<String> systems;

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

        // add list of languages to the model
        theModel.addAttribute("languages", languages);

        // add list of systems to the model
        theModel.addAttribute("systems", systems);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult theBindingResult) {

        // log the input data
        // System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName() + " / Age: " + theStudent.getAge());
        System.out.println("First name: |" + theStudent.getFirstName() + "| " + "Last name: |" + theStudent.getLastName());

        if (theBindingResult.hasErrors()) {
            return "student-form";
        } else {
            return "student-confirmation";
        }
    }
}
