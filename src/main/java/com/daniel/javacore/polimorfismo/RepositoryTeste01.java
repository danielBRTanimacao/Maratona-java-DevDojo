package com.daniel.javacore.polimorfismo;

import com.daniel.javacore.polimorfismo.repository.Repository;
import com.daniel.javacore.polimorfismo.service.RepositoryDB;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositoryTeste01 {
    public static void main(String[] args) {
        Repository rp = new RepositoryDB(); // Basta trocar o obj
        rp.save(); // Orientando a interfaces

        // Exemplo padrão java
        List<String> listStrings = new ArrayList<>();
        // ou
        List<String> listStrings2 = new LinkedList<>();

        listStrings.add("1");
        listStrings.add("2");
        listStrings.add("3");

        System.out.println(listStrings);
    }
}
