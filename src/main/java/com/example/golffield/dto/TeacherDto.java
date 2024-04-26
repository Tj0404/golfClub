package com.example.golffield.dto;

import com.example.golffield.entity.Teacher;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {
    @NotNull
    private String teacherCode;
    private String teacherName;
    private String className;
    private int classPrice;
    private String teacherGetDate;

    public Teacher fromTeacherDto(TeacherDto dto){
        Teacher teacher = new Teacher();
        teacher.setTeacherCode(dto.getTeacherCode());
        teacher.setTeacherName(dto.getTeacherName());
        teacher.setClassName(dto.getClassName());
        teacher.setClassPrice(dto.getClassPrice());
        teacher.setTeacherGetDate(dto.getTeacherGetDate());
        return teacher;
    }

    public static TeacherDto fromTeacher(Teacher teacher){
        return new TeacherDto(
                teacher.getTeacherCode(),
                teacher.getTeacherName(),
                teacher.getClassName(),
                teacher.getClassPrice(),
                teacher.getTeacherGetDate()
        );
    }
}
