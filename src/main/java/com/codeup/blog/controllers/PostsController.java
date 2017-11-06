package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.services.PostSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller //Step 1 Annotate
public class PostsController {

    private final PostSvc postSvc;

    @Autowired
    public PostsController(PostSvc postSvc){
        this.postSvc = postSvc;
    }

    @GetMapping("/posts") //Step 2 what url want to respond to
    public String showAll(Model vModel) {
//        ArrayList<Post> posts = new ArrayList<>();
//
//        posts.add(new Post("Title One", "Body goes here"));
//        posts.add(new Post("Title 2", "Body goes here"));
//        posts.add(new Post("Title 3", "Body goes here"));
//        List<Post> posts = postSvc.findAll();
//        vModel.addAttribute("posts", posts);
        vModel.addAttribute("posts", postSvc.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String showPost(@PathVariable int id, Model vModel) {

        Post post = new Post("Example 1", "Body goes here");

        vModel.addAttribute("post", post);
        return "post/show";
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
