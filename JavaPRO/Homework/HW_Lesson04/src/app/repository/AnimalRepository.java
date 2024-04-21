package app.repository;

import app.domain.Animal;

public interface AnimalRepository {

    Animal getById(Long id);
}
