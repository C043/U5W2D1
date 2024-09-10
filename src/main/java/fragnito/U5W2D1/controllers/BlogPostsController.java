package fragnito.U5W2D1.controllers;

import fragnito.U5W2D1.entities.BlogPost;
import fragnito.U5W2D1.services.BlogPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogPostsController {
    @Autowired
    private BlogPostsService blogPostsService;

    @GetMapping
    public List<BlogPost> getBlogPosts(){
        return blogPostsService.findBlogPosts();
    }
}
