package com.example.golffield.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@ToString
@Table(name = "class")
public class ClassE {
    @Id
    @Column(name = "class_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classId;
    @Column(name = "resist_month", length = 6)
    private String resistMonth;
    @Column(name = "class_no", length = 5)
    @JoinColumn(name = "member_id")
    private String classNo;
    @Column(name = "class_area", length = 15)
    private String classArea;
    private int tuition;
    @Column(name = "teacher_code", length = 3)
    @JoinColumn(name = "teacher_code")
    private String teacherCode;

}
