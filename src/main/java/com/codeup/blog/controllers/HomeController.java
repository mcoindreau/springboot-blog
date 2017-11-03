package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping("/home") //STep 2 what url want to respond to
    @ResponseBody //return the content of body of the home method below;no need since Thymeleaf
    public String showLandingPage() {
        return "home";
    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model viewModel){ //Model allows to VIEW URL objects

        ArrayList<String> names = new ArrayList<>();

        names.add("Mari");
        names.add("Ryan");
        names.add("Rosalie");

        viewModel.addAttribute("listOfNames", names);
        viewModel.addAttribute("name", name);
        viewModel.addAttribute("rainy", false);


        return "hello";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

}
