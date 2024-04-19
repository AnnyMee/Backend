package app.people.staff.teachers;

import app.people.students.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {

    @Autowired
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void work() {
        student.study();
        System.out.println("Домашние задания заданы и следующие уроки подготовлены!");
    }
}
