package service;

public class ArtistaNaoEncontradoException extends Exception {

    public ArtistaNaoEncontradoException(String nomeArtista) {
        super("Artista não encontrado: " + nomeArtista);
    }
}
