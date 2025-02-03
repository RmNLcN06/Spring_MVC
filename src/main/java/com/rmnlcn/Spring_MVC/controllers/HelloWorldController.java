package com.rmnlcn.Spring_MVC.controllers;

// import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    // need controller method to show initial HTML form
    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // need controller method to read form data & add data to the model
    @RequestMapping("/processFormUpperCase")
    public String processFormUpperCase(@RequestParam("studentName") String theName, Model model) {
    // public String processFormUpperCase(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        // no need with @RequestParam
        // String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Welcome to the team " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

}
