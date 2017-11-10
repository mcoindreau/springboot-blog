package com.codeup.blog.services;

import com.codeup.blog.models.User;
import com.codeup.blog.models.UserWithRoles;
import com.codeup.blog.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserDetailsLoader implements UserDetailsService {
    private final UsersRepository repository;

    @Autowired
    public UserDetailsLoader(UsersRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByUsername(username); //find user by username in log in process
        if (user == null) { //if not found, tell component couldn't fit it, component needs to handle it
            throw new UsernameNotFoundException(String.format("No user found for " + username));
        }
        //next step is sharing with component ID and password

        return new UserWithRoles(user);
    }
}