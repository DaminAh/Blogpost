package services;

import com.damin.blogpost.models.Post;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList<Post> getAllPost() {

        ArrayList<Post> posts = new ArrayList<>();
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
        return posts;
    }
}
