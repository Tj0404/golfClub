package com.example.golffield.dto;

import com.example.golffield.entity.ClassE;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Range;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClassDto {
    @NotNull
    private Long classId;
    @Range(min = 6, max = 6, message = "년도 4자리, 월 2자리, 총 6자리 수로 입력해주세요.")
    private String resistMonth;
    private String classNo;
    @NotBlank(message = "강의 장소를 입력해주세요.")
    private String classArea;
    private int tuition;
    private String teacherCode;


    public static ClassDto fromClass(ClassE classE){
        return new ClassDto(
                classE.getClassId(),
                classE.getResistMonth(),
                classE.getClassNo(),
                classE.getClassArea(),
                classE.getTuition(),
                classE.getTeacherCode()
        );
    }

    public ClassE fromClassDto(ClassDto dto){
        ClassE classE = new ClassE();
        classE.setClassId(dto.getClassId());
        classE.setResistMonth(dto.getResistMonth());
        classE.setClassNo(dto.getClassNo());
        classE.setClassArea(dto.getClassArea());
        classE.setTuition(dto.getTuition());
        classE.setTeacherCode(dto.getTeacherCode());
        return classE;
    }
}
