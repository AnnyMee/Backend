package app.controller;

import app.domain.Animal;
import app.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalController {

    @Autowired
    private AnimalService service;

//    public AnimalController(AnimalService service) {
//        this.service = service;
//    }

    public Animal getById(Long id) {
        return service.getById(id);
    }
}
