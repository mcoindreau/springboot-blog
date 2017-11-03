package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Step 1 Annotate
public class HelloWorldController {

//    @GetMapping("/hello") //STep 2 what url want to respond to
//    @ResponseBody //return the content of body of the hello method below
//    public String hello() {
//        return "Hello, World!!";
//    }
//
//    @GetMapping("/hello/{name}")
//    @ResponseBody
//    public String sayHello(@PathVariable String name) {
//        return "Hello " + name + "!";
//    }
}
