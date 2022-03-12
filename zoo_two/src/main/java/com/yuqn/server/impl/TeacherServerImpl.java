package com.yuqn.server.impl;

import com.yuqn.entity.Teacher;
import com.yuqn.server.TeacherServer;

public class TeacherServerImpl implements TeacherServer {
    @Override
    public Teacher teasel() {
        return new Teacher(1,"teacher");
    }
}
