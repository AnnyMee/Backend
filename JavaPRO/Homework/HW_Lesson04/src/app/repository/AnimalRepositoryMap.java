package app.repository;

import app.domain.Animal;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AnimalRepositoryMap implements AnimalRepository{

    private Map<Long, Animal> database = new HashMap<>();

    public AnimalRepositoryMap() {
        database.put(1L, new Animal(1L, "Собака", "Ральф", 1200));
        database.put(2L, new Animal(2L, "Собака", "Мия", 1520));
        database.put(3L, new Animal(3L, "Кошка", "Китти", 950));
        database.put(4L, new Animal(4L, "Кошка", "Мэни", 1100));
    }

    @Override
    public Animal getById(Long id) {
        return database.get(id);
    }
}
