package com.example.studentlist;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private UUID id;
    private String firstName;
    private String lastName;
    private int age;

}
