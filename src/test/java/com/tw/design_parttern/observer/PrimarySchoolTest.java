package com.tw.design_parttern.observer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimarySchoolTest {

    @Test
    void should_get_feeling_from_male_student_when_homework_is_dispatched() {
        PrimarySchool no1PrimarySchool = new No1PrimarySchool();
        FeelingReceiver feelingReceiver = new HumanFeelingReceiver();
        Student maleStudent = new MaleStudent(feelingReceiver);

        maleStudent.waitingForHomework(no1PrimarySchool);
        no1PrimarySchool.dispatchHomework("Math");
        List<String> feelings = feelingReceiver.getFeelings();

        assertEquals(1, feelings.size());
        assertEquals("Fuck, Math", feelings.get(0));
    }

    @Test
    void should_not_get_feeling_when_homework_is_not_dispatched() {
        PrimarySchool no1PrimarySchool = new No1PrimarySchool();
        FeelingReceiver feelingReceiver = new HumanFeelingReceiver();
        Student maleStudent = new MaleStudent(feelingReceiver);

        maleStudent.waitingForHomework(no1PrimarySchool);
        List<String> feelings = feelingReceiver.getFeelings();

        assertEquals(0, feelings.size());
    }

    @Test
    void should_not_get_feelings_when_male_student_is_not_enrolled() {
        PrimarySchool no1PrimarySchool = new No1PrimarySchool();
        FeelingReceiver feelingReceiver = new HumanFeelingReceiver();
        Student maleStudent = new MaleStudent(feelingReceiver);

        no1PrimarySchool.dispatchHomework("Math");
        List<String> feelings = feelingReceiver.getFeelings();

        assertEquals(0, feelings.size());
    }

    @Test
    void should_get_feeling_from_female_student_when_homework_is_dispatched() {
        PrimarySchool no1PrimarySchool = new No1PrimarySchool();
        FeelingReceiver feelingReceiver = new HumanFeelingReceiver();
        Student femaleStudent = new FemaleStudent(feelingReceiver);

        femaleStudent.waitingForHomework(no1PrimarySchool);
        no1PrimarySchool.dispatchHomework("Math");
        List<String> feelings = feelingReceiver.getFeelings();

        assertEquals(1, feelings.size());
        assertEquals("I love Math", feelings.get(0));
    }

    @Test
    void should_get_feelings_from_both_students_when_homework_is_dispatched() {
        PrimarySchool no1PrimarySchool = new No1PrimarySchool();
        FeelingReceiver feelingReceiver = new HumanFeelingReceiver();
        Student maleStudent = new MaleStudent(feelingReceiver);
        Student femaleStudent = new FemaleStudent(feelingReceiver);

        maleStudent.waitingForHomework(no1PrimarySchool);
        femaleStudent.waitingForHomework(no1PrimarySchool);
        no1PrimarySchool.dispatchHomework("English");
        List<String> feelings = feelingReceiver.getFeelings();

        assertEquals(2, feelings.size());
        assertTrue(feelings.contains("Fuck, English"));
        assertTrue(feelings.contains("I love English"));
    }
}

