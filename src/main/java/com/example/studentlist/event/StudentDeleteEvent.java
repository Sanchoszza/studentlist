package com.example.studentlist.event;

import org.springframework.context.ApplicationEvent;

import java.util.UUID;

public class StudentDeleteEvent extends ApplicationEvent {

    private UUID id;

    public StudentDeleteEvent(Object source, UUID id) {
        super(source);
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
