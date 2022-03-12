package com.yuqn.controller;

import com.yuqn.entity.Student;
import com.yuqn.entity.Teacher;
import com.yuqn.server.TeacherServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TeacherController {
    @Resource
    private TeacherServer teacherServer;

    @RequestMapping(value = "/teaSel")
    public String StudentSel(Model model){
        Teacher teacher=teacherServer.teasel();
        model.addAttribute("teacher",teacher);
        return "teasel";
    }
}
