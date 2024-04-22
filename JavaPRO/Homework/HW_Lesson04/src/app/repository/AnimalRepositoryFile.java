package app.repository;

import app.domain.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileReader;

@Primary
@Repository
public class AnimalRepositoryFile implements AnimalRepository{
    @Override
    public Animal getById(Long id) {
        try (BufferedReader reader = new BufferedReader(new FileReader("database.txt"))){

            return reader.lines()
                    .filter(x -> x.split("-")[0].equals(id.toString()))
                    .limit(1)
                    .map(x -> {
                        String[] values = x.split("-");
                        double price = Double.parseDouble(values[3]);
                        return new Animal(id,values[1],values[2],price);
                    })
                    .findFirst()
                    .orElse(null);

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}