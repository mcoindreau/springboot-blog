//package com.codeup.blog.services;
//
//import com.codeup.blog.models.Post;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service("adSvc")
//public class PostService {
//
//    private List<Post> posts; //private and not being shared
//
//    //create constructor with the same name as class
//    public AdService() {
//        createAds();
//    }
//
//    //find all the ads
//    public List<Ad> findAll() {
//        return ads;
//    }
//
//    //don't want the list, just individual ad by looking for index, get index
//    public Ad findOne(long id) {
//        return ads.get((int)(id - 1)); // Fer had trouble, needed to cast as int
//    }
//
////    Private to create ads; function only accessible in this class
//    private void createAds() { //method
//    // create some ad objects and add them to the ads list
//    // with the save method
//
//        posts.add(new Post("Title", "Body goes here"));
//        posts.add(new Post("Title 2", "Body goes here"));
//        posts.add(new Post("Title 3", "Body goes here"));
//    }
//
//}
