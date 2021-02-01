package com.damin.blogpost.controller;

import com.damin.blogpost.models.Post;
import com.damin.blogpost.models.User;
import com.damin.blogpost.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class UserController {

    @Autowired
    PostService postService;

    @RequestMapping("users/login")
    public  String login(){
        return "users/login";
    }

    @RequestMapping("users/registration")
    public  String register(){
        return "users/registration";
    }

    @RequestMapping(value = "users/login",method = RequestMethod.POST)
    public String userLoggedIn(User user){
        return "redirect:/posts";
    }

    @RequestMapping(value = "users/logout",method = RequestMethod.POST)
    public String logout(Model myModel){
        ArrayList<Post> posts =postService.getAllPost();
        myModel.addAttribute("toast",posts);
        return "index.html";

    }
}
