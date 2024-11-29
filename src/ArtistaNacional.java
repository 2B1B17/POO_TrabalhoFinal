package model;

public class ArtistaNacional extends model.Artista {

    public ArtistaNacional(String nome, String genero, double cache, int apelo) {
        super(nome, genero, cache, apelo);
    }

    @Override
    public void apresentarShow() {
        System.out.println(getNome() + " está arrasando no palco com um show de " + getGenero() + " nacional!");
    }
}
