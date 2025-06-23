package com.daniel.javacore.introducao.sobrecarga;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Anime01 {
    private String name;
    private int[] episodes;

    { // Bloco de construção inicialização
        System.out.println("Iniciando anime01");
        this.episodes = new int[100];
        for (int i = 0; i < this.episodes.length; i++) {
            this.episodes[i] = i+1;
        }
    }

    public Anime01(String name) {
        this.name = name;
    }

    public Anime01() {
        for(int eps : episodes){
            System.out.println("Episodio: " + eps);
        }
    }
}
