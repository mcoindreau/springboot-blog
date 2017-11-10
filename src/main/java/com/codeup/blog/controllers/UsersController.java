package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.models.User;
import com.codeup.blog.repositories.UsersRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class UsersController {

    private PasswordEncoder encoder;
    private UsersRepository repository;

    public UsersController(PasswordEncoder encoder, UsersRepository, repository){
        this.encoder = encoder;
        this.repository = repository;
    }

    public UsersController(){

    }

    @GetMapping("/register") //url to view
    public String ShowRegistrationForm(Model vModel) { //make sure has model that represents view
        vModel.addAttribute("user", new User());
        return "users/registration"; //actual file returned
    }

    @PostMapping("/register") //
    public String RegisterUser(@ModelAttribute User user) { //use model attribute; accepts object of type post

        user.setPassword(hash);
        repository.save(post);
        return "redirect:/posts";
    }
}
