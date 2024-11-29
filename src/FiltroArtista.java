package service;

import model.Artista;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroArtista {

    public static List<Artista> filtrarPorGenero(List<Artista> artistas, String genero) {
        return artistas.stream()
                .filter(artista -> artista.getGenero().equalsIgnoreCase(genero))
                .collect(Collectors.toList());
    }

    public static List<Artista> filtrarPorApelo(List<Artista> artistas, int apeloMinimo) {
        return artistas.stream()
                .filter(artista -> artista.getApelo() >= apeloMinimo)
                .collect(Collectors.toList());
    }
}
