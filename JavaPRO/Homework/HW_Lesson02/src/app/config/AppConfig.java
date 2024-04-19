package app.config;

import app.people.staff.administration.Director;
import app.people.staff.administration.Secretary;
import app.people.staff.teachers.Teacher;
import app.people.students.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Director director() {
        return new Director();
    }
    @Bean
    public Secretary secretary() {
        return new Secretary();
    }
    @Bean
    public Teacher teacher() {
        return new Teacher();
    }
    @Bean
    public Student student() {
        return new Student();
    }
}
