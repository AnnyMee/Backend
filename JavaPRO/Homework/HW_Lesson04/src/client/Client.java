package client;

import app.controller.AnimalController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app");
        AnimalController controller = context.getBean(AnimalController.class);
        System.out.println(controller.getById(2L));

    }
}
