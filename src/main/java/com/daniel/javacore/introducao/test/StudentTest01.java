package com.daniel.javacore.introducao.test;

import com.daniel.javacore.introducao.domain.PrintMachine;
import com.daniel.javacore.introducao.mytests.Student;

import javax.naming.directory.InvalidAttributesException;

public class StudentTest01 {
    public static void main(String[] args) throws InvalidAttributesException {
        PrintMachine printMachine = new PrintMachine();
        printMachine.name = "Maquina01";
        printMachine.velocityPerMinute = 5;
        printMachine.setMaxPaper(15);
        printMachine.addPaint("Vermelho", "50");
        printMachine.addPaint("Verde", "59.6");

        printMachine.printInfosMachine();
    }
}
