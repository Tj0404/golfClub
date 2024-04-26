package com.example.golffield.controller;

import com.example.golffield.dto.ClassDto;
import com.example.golffield.dto.MemberDto;
import com.example.golffield.dto.TeacherDto;
import com.example.golffield.service.GolfService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("golfclub")
public class GolfController {
    public final GolfService golfService;

    public GolfController(GolfService golfService) {
        this.golfService = golfService;
    }

    @GetMapping("")
    public String mainView(){
        return "views/main";
    }

    @GetMapping("insert")
    public String classInsertForm(Model model){
        List<ClassDto> classDtos = golfService.findClass();
        List<MemberDto> memberDtos = golfService.findMember();
        List<TeacherDto> teacherDtos = golfService.findTeacher();

        model.addAttribute("classes", new ClassDto());
        model.addAttribute("members", memberDtos);
        model.addAttribute("teachers", teacherDtos);

        return "views/classInsertForm";
    }


}
