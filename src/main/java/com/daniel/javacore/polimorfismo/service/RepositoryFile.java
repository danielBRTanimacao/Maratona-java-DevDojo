package com.daniel.javacore.polimorfismo.service;

import com.daniel.javacore.polimorfismo.repository.Repository;

public class RepositoryFile implements Repository {
    @Override
    public void save() {
        System.out.println("Save file");
    }
}
