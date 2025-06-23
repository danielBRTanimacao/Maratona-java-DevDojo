package com.daniel.javacore.introducao.sobrecarga.teste;

import com.daniel.javacore.introducao.sobrecarga.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anim = new Anime();

        anim.setType("Shounen");
        anim.setEpisodes(30);
        anim.print("Shounen", 1200, "Luffy");
    }
}
