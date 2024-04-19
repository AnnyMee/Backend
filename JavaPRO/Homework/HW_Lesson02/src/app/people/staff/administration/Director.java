package app.people.staff.administration;

import app.people.staff.teachers.Teacher;
import org.springframework.beans.factory.annotation.Autowired;

public class Director {

    @Autowired
    private Secretary secretary;
    @Autowired
    private Teacher teacher;

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void manageSchool() {
        secretary.work();
        teacher.work();
    }
}
