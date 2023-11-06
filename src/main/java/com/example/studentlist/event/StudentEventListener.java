package com.example.studentlist.event;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StudentEventListener {

    @EventListener
    public void onStudentCreated(StudentCreateEvent studentCreateEvent){
        System.out.println("Student was created " + studentCreateEvent.getStudent());
    }

    @EventListener
    public void onStudentDelete(StudentDeleteEvent studentDeleteEvent){
        System.out.println("Student was deleted " + studentDeleteEvent.getId());
    }
}
