package com.example.golffield.service;

import com.example.golffield.dto.ClassDto;
import com.example.golffield.dto.MemberDto;
import com.example.golffield.dto.TeacherDto;
import com.example.golffield.entity.ClassE;
import com.example.golffield.entity.Member;
import com.example.golffield.entity.Teacher;
import com.example.golffield.repository.ClassRepository;
import com.example.golffield.repository.MemberRepository;
import com.example.golffield.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GolfService {
    public final ClassRepository classRepository;
    public final MemberRepository memberRepository;
    public final TeacherRepository teacherRepository;

    public GolfService(ClassRepository classRepository, MemberRepository memberRepository, TeacherRepository teacherRepository) {
        this.classRepository = classRepository;
        this.memberRepository = memberRepository;
        this.teacherRepository = teacherRepository;
    }

    public List<ClassDto> findClass() {
        List<ClassDto> classes = classRepository.findAll()
                .stream()
                .map(x -> ClassDto.fromClass(x))
                .toList();
        return classes;
    }
    public List<MemberDto> findMember() {
        List<MemberDto> members = memberRepository.findAll()
                .stream()
                .map(x -> MemberDto.fromMember(x))
                .toList();
        return members;
    }
    public List<TeacherDto> findTeacher() {
        List<TeacherDto> teachers = teacherRepository.findAll()
                .stream()
                .map(x -> TeacherDto.fromTeacher(x))
                .toList();
        return teachers;
    }



}
