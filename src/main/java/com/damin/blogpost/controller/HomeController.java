package com.damin.blogpost.controller;


import com.damin.blogpost.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getAllPost(Model model) {

        ArrayList<Post> posts= new ArrayList<>();
        Post obj1 = new Post();
        obj1.setTitle("Post1");
        obj1.setBody("Post 1 body");
        obj1.setDate(new Date());

        Post obj2 = new Post();
        obj2.setTitle("Post1");
        obj2.setBody("Post 1 body");
        obj2.setDate(new Date());

        Post obj3 = new Post();
        obj3.setTitle("Post1");
        obj3.setBody("Post 1 body");
        obj3.setDate(new Date());


        posts.add(obj1);
        posts.add(obj2);
        posts.add(obj3);

        model.addAttribute("toast",posts);
        return "index";

    }
}
