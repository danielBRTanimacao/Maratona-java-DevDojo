package com.daniel.javacore.introducao.sobrecarga;

public class Anime {
    private String type;
    private int episodes;

    public void print(String type, int episodes) {
        System.out.println("Tipo do anime: " + type);
        System.out.println("Episodios: " + episodes);
    }

    public void print(String type, int episodes, String name) {
        this.print(type, episodes);
        System.out.println("Protagonista: " + name);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
