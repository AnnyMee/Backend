package app.service;

import app.domain.Animal;

public interface AnimalService {
    Animal getById(Long id);

    void setArticle(Animal animal);
}
