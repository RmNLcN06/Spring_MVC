package com.rmnlcn.Spring_MVC.controllers;

import com.rmnlcn.Spring_MVC.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    // create method to show the from
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel) {

        // create student object
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }
}
