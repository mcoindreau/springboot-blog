package com.codeup.blog.models;

import com.sun.tools.javah.Gen;

import javax.persistence.*;

@Entity
//@Table(name="")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    //By default, String properties will be mapped to VARCHAR columns, if we want a column of type TEXT, we can specify it like so:
    @Column(columnDefinition = "TEXT", nullable = false)
    private String body;

//    @OneToOne //post can only have one user_id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Post(Long id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post(){

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId(){
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}