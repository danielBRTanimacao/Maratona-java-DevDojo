package com.daniel.javacore.interfaces.domain;

public interface DataLoger {
    void logs(); // Todos os metodos são abstracts e publics
    void checkPermission();

    default void checkStream() {}
}
