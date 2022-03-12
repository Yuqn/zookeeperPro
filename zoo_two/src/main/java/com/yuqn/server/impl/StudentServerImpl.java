package com.yuqn.server.impl;

import com.yuqn.entity.Student;
import com.yuqn.server.StudentServer;

public class StudentServerImpl implements StudentServer {
    @Override
    public Student StudentSel() {
        return new Student(1,"余一号",21);
    }

    @Override
    public Student StudentSelTwo() {
        return new Student(2,"余二号",21);
    }
}
