package com.damin.blogpost.controller;
import com.damin.blogpost.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.damin.blogpost.services.PostService;
import java.util.ArrayList;

@Controller
@Component
public class HomeController {
    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getAllPost(Model model) {
        ArrayList<Post> posts=postService.getAllPost();
        model.addAttribute("toast",posts);
        return "index";

    }
}
