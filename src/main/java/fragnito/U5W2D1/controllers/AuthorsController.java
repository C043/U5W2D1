package fragnito.U5W2D1.controllers;

import fragnito.U5W2D1.entities.Author;
import fragnito.U5W2D1.services.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorsController {
    @Autowired
    private AuthorsService authorsService;

    @GetMapping
    public List<Author> getAuthors(){
        return authorsService.getAuthorList();
    }

    @PostMapping
    public Author saveAuthor(@RequestBody Author body){
        return authorsService.saveAuthor(body);
    }
}
