package fragnito.U5W2D1.controllers;

import fragnito.U5W2D1.entities.BlogPost;
import fragnito.U5W2D1.services.BlogPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{postId}")
    public BlogPost getBlogPostById(@PathVariable int postId){
        return blogPostsService.getBlogPostById(postId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BlogPost postBlogPost(@RequestBody BlogPost body){
        return blogPostsService.saveBlogPost(body);
    }
}
