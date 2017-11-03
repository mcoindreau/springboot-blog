package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Step 1 Annotate
public class PostsController {

    @GetMapping("/posts") //Step 2 what url want to respond to
    @ResponseBody //return the content of body of the hello method below
    public String posts() {
        return "Post index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsId() {
        return "View an individual pos";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String ViewCreateForm() {
        return "View the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String CreatePost() {
        return "Create a new post";
    }
}
