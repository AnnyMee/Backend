package app.controller;

import app.model.Car;
import app.model.CarRepository;
import app.model.CarRepositoryMap;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

public class CarServlet extends HttpServlet {

    private CarRepository repository = new CarRepositoryMap();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // http://255.255.255.15:8080/cars?id=5 - наша задача получить идентификатор из запроса

        Map<String, String[]> parameters = req.getParameterMap();

        //todo проверить работу
//        String action = parameters.get("action") != null ? parameters.get("action")[0] : "";
//
//        if ("getAll".equals(action)) {
//            doGetAll(req, resp);
//        } else {
            Long id = Long.parseLong(parameters.get("id")[0]);
            resp.getWriter().write(repository.getById(id).toString());
//        }
    }

    protected void doGetAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write(repository.getAll().toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, String[]> parameters = req.getParameterMap();
        String brand = parameters.get("brand")[0];
        BigDecimal price = new BigDecimal(parameters.get("price")[0]);
        int year = Integer.parseInt(parameters.get("year")[0]);
        Car car = new Car(brand, price, year);
        repository.save(car);

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, String[]> parameters = req.getParameterMap();
        Long id = Long.parseLong(parameters.get("id")[0]);
        BigDecimal price = new BigDecimal(parameters.get("price")[0]);
        Car car = repository.getById(id);
        if (car != null) {
            car.setPrice(price);
            repository.update(car);
        }

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, String[]> parameters = req.getParameterMap();
        Long id = Long.parseLong(parameters.get("id")[0]);
        repository.delete(id);

    }
}
