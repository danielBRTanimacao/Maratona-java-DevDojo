package com.daniel.javacore.introducao.arrayObjetos;

import com.daniel.javacore.introducao.arrayObjetos.dominio.Player;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player("Pelé");
        Player player2 = new Player("Neymar");
        Player player3 = new Player("Messi");
        Player[] players = {player, player2, player3};
        for (Player p : players) {
            p.print();
        }
    }
}
