package com.example.studentlist.event;

import com.example.studentlist.students.Student;
import org.springframework.context.ApplicationEvent;

public class StudentCreateEvent extends ApplicationEvent {

    private Student student;
    public StudentCreateEvent(Object source, Student student) {
        super(source);
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}
