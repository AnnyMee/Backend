package app.code;

import app.people.staff.administration.Director;
import app.people.staff.administration.Secretary;
import app.people.staff.teachers.Teacher;
import app.people.students.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {

//        Student student = new Student();
//
//        Teacher teacher = new Teacher();
//        teacher.setStudent(student);
//        Secretary secretary = new Secretary();
//
//        Director director = new Director();
//        director.setSecretary(secretary);
//        director.setTeacher(teacher);
//
//        director.manageSchool();

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
        Director director = context.getBean(Director.class);
        director.manageSchool();
    }
}
