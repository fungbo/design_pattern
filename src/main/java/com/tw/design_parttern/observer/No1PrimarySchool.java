package com.tw.design_parttern.observer;

import java.util.ArrayList;
import java.util.List;

public class No1PrimarySchool implements PrimarySchool {

    private final List<Student> students = new ArrayList<>();

    @Override
    public void enrollIn(Student student) {
        students.add(student);
    }

    @Override
    public void dispatchHomework(String math) {
        students.forEach(student -> student.doHomework(math));
    }
}
