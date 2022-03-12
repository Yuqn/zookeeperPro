package com.yuqn.controller;

import com.yuqn.entity.Student;
import com.yuqn.server.StudentServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentServer studentServer;

    @RequestMapping(value = "/stuSel")
    public String StudentSel(Model model){
        Student student=studentServer.StudentSel();
        model.addAttribute("student",student);
        return "stusel";
    }

    @RequestMapping(value = "/stuSelTwo")
    public String StudentSelTwo(Model model){
        Student student=studentServer.StudentSelTwo();
        model.addAttribute("student",student);
        return "stusel";
    }
}
