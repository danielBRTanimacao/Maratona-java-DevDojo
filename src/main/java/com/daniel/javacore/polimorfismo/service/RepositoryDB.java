package com.daniel.javacore.polimorfismo.service;

import com.daniel.javacore.polimorfismo.repository.Repository;

public class RepositoryDB implements Repository {
    @Override
    public void save() {
        System.out.println("Save Data base");
    }
}
