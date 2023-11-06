package com.example.studentlist;

import com.example.studentlist.properties.ApplicationProperties;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();
    private final ApplicationEventPublisher applicationEventPublisher;
    private final ApplicationProperties applicationProperties;


    public StudentService(ApplicationEventPublisher applicationEventPublisher, ApplicationProperties applicationProperties) {
        this.applicationEventPublisher = applicationEventPublisher;
        this.applicationProperties = applicationProperties;

        if (applicationProperties.isCreateOnStart()){
            initStudent();
        }
    }

    private void initStudent() {
        addStudent("Ivan", "Ivanov", 21);
        addStudent("Svetlana", "Sv", 20);
        System.out.println("Students added on start");
    }

    public List<Student> getAllStudents(){
        return students;
    }

    public Student addStudent(String firstName, String lastName, int age){
        Student student = new Student();
        student.setId(generateUniqueId());
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setAge(age);
        students.add(student);

//        applicationEventPublisher.publishEvent(new StudentCreateEvent(this, student));
        return student;
    }

    public void deleteStudent(UUID id){
        students.removeIf(student -> student.getId().equals(id));

//        applicationEventPublisher.publishEvent(new StudentDeleteEvent(this, id));
    }

    public void clearStudents(){
        students.clear();
    }

    private UUID generateUniqueId() {
        return UUID.randomUUID();
    }
}
