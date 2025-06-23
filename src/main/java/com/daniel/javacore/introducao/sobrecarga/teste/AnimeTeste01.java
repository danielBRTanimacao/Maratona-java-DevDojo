package com.daniel.javacore.introducao.sobrecarga.teste;

import com.daniel.javacore.introducao.sobrecarga.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anim = new Anime("Shounen", 100);
        Anime anime2 = new Anime("Preda");

        anim.print("Shounen", 1200, "Luffy");
    }
}
