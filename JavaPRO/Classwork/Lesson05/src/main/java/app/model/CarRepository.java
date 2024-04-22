package app.model;

import java.util.List;

public interface CarRepository {

    Car save (Car car);

    Car gatById(Long id);

    List<Car> getAll();

    void update (Car car);

    void delete (Long id);
}
