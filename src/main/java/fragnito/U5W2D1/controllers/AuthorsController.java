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

    @GetMapping("/{authorId}")
    public Author getAuthorById(@PathVariable int authorId){
        return authorsService.findAuthorById(authorId);
    }

    @PostMapping
    public Author saveAuthor(@RequestBody Author body){
        return authorsService.saveAuthor(body);
    }

    @PutMapping("/{authorId}")
    public Author putAuthor(@PathVariable int authorId, @RequestBody Author body){
        return authorsService.updateAuthor(authorId, body);
    }

    @DeleteMapping("/{authorId}")
    public String deleteAuthor(@PathVariable int authorId){
        authorsService.deleteAuthor(authorId);
        return "Autore eliminato con successo.";
    }
}