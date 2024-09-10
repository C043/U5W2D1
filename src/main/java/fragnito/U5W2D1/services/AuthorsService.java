package fragnito.U5W2D1.services;

import fragnito.U5W2D1.entities.Author;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AuthorsService {
    private final List<Author> authorList = new ArrayList<>();

    public List<Author> getAuthorList(){
        return this.authorList;
    }

    public Author findAuthorById(int authorId){
        return authorList.stream().filter(author -> author.getId() == authorId).findFirst().orElseThrow();
    }

    public Author saveAuthor(Author body){
        Random rand = new Random();
        body.setId(rand.nextInt(1, 1000));
        body.setAvatar("https://ui-avatars.com/api/?name=" + body.getNome() + "+" + body.getCognome());
        authorList.add(body);
        return body;
    }
}
