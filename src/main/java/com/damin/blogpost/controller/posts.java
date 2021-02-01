package com.damin.blogpost.controller;
import com.damin.blogpost.models.Post;
import com.damin.blogpost.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class posts {
    @Autowired
   private PostService postService;

    @RequestMapping("posts")
    public String getOnePost(Model myModel){

        ArrayList<Post> posts=postService.getOnePost();
        myModel.addAttribute("toast",posts);
        return "posts";

    }
}
