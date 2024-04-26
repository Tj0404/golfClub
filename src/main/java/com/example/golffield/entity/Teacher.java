package com.example.golffield.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;


@Entity
@ToString
@Data
public class Teacher {
    @Id
    @Column(name = "teacher_code", length = 3)
    private String teacherCode;
    @Column(name = "teacher_name", length = 15)
    private String teacherName;
    @Column(name = "class_name", length = 20)
    private String className;
    private int classPrice;
    @Column(name = "teacher_get_date", length = 8)
    private String teacherGetDate;

}
