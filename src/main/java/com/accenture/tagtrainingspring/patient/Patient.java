package com.accenture.tagtrainingspring.patient;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Patient {
    private String name;
    private Integer id;
    private LocalDate dateOfBirth;
    private Gender gender;
}
