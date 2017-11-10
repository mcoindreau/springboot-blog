package com.codeup.blog.repositories;

import com.codeup.blog.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<User, Long>{
    //Query Methods
    //Post findByTitle(String title);
    User findByUsername(String username);
}
