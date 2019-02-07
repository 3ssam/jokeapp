package mo.springframework.joke.controllers;

import mo.springframework.joke.services.jokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class JokesController {
    private jokeService jokeService;

    @Autowired
    public JokesController(jokeService jokeService) {
        this.jokeService = jokeService;
    }


}
