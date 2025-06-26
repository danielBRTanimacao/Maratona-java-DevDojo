package com.daniel.javacore.introducao.arrayObjetos;

import com.daniel.javacore.introducao.arrayObjetos.dominio.Player;
import com.daniel.javacore.introducao.arrayObjetos.dominio.Time;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player p1 = new Player("Daniel");
        Time t1 = new Time("Corintiaa");
        p1.setTime(t1);

        Player p2 = new Player("Bico seco");
        p2.print();
    }
}
