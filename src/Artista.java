package model;

public abstract class Artista {
    private String nome;
    private String genero;
    private double cache;
    private int apelo;

    public Artista(String nome, String genero, double cache, int apelo) {
        this.nome = nome;
        this.genero = genero;
        this.cache = cache;
        this.apelo = apelo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public double getCache() {
        return cache;
    }

    public int getApelo() {
        return apelo;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract void apresentarShow();
}
