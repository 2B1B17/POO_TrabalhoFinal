package model;

public class ArtistaInternacional extends model.Artista {

    public ArtistaInternacional(String nome, String genero, double cache, int apelo) {
        super(nome, genero, cache, apelo);
    }

    @Override
    public void apresentarShow() {
        System.out.println(getNome() + " está brilhando no palco com um show de " + getGenero() + " internacional!");
    }
}
