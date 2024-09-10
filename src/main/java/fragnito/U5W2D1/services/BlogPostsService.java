package fragnito.U5W2D1.services;

import fragnito.U5W2D1.entities.BlogPost;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostsService {
    private List<BlogPost> blogPostList;

    public List<BlogPost> findBlogPosts(){
        return this.blogPostList;
    }
}
