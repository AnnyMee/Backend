package app.service;

import app.domain.Animal;
import app.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class AnimalServiceImpl implements AnimalService{

    private String articlePrefix;
    private AnimalRepository repository;

    public AnimalServiceImpl(@Value("${article.prefix}") String articlePrefix, @Qualifier("animalRepositoryMap") AnimalRepository repository) {
        this.articlePrefix = articlePrefix;
        this.repository = repository;
    }

    @Override
    public Animal getById(Long id) {
        Animal animal = repository.getById(id);
        setArticle(animal);
        return animal;
    }

    @Override
    public void setArticle(Animal animal) {
        String article = String.format("%s:%c-%d", articlePrefix, animal.getType().charAt(0), animal.getId());
        animal.setArticle(article);

    }
}
