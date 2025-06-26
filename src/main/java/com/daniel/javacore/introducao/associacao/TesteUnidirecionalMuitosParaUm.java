package com.daniel.javacore.introducao.associacao;

public class TesteUnidirecionalMuitosParaUm {
    public static void main(String[] args) {
        School school = new School("Escola");
        Professor professor = new Professor("Jiraya Sensei");
        school.setProfessors(new Professor[]{professor});

        school.print();
    }
}
