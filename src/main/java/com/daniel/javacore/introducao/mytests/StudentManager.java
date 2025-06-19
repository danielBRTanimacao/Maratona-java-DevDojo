package com.daniel.javacore.introducao.mytests;

public class StudentManager {
    private final String[] CHOOSEROOM = {
            "A1", "A2", "A3",
            "B1", "B2", "B3",
            "C1", "C2", "C3",
            "D1", "D2", "D3"
    };

    private Student student;

    public StudentManager(Student student) {
        this.student = student;
    }

    public void setStudentClass(int choose) {
        this.student.setClass(CHOOSEROOM[choose]);
    }
}
