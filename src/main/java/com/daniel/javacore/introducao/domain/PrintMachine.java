package com.daniel.javacore.introducao.domain;

import javax.naming.directory.InvalidAttributesException;
import java.util.ArrayList;
import java.util.List;

public class PrintMachine {
    public String name;
    public double velocityPerMinute;
    public int MaxPaper = 50;
    public List<PaintRecord> paints = new ArrayList<>();

    public void printInfosMachine() {
        System.out.println("Name: " + name);
        System.out.println("Print per minute: " + velocityPerMinute);
        System.out.println("Max paper: " + MaxPaper);
        for (PaintRecord p : paints) {
            System.out.println(p);
        }
    }

    public void setMaxPaper(int newMax) {
        this.MaxPaper = newMax;
    }

    public void addPaint(String name, String level) throws InvalidAttributesException {
        this.raiseInvalidAttribute(level);
        paints.add(new PaintRecord(name, level));
    }

    public void raiseInvalidAttribute(String lvl) throws InvalidAttributesException {
        try {
            Double.parseDouble(lvl);
        } catch (NumberFormatException e) {
            throw new InvalidAttributesException("VALOR level invalido! " + e.getMessage());
        }
    }

}
