package ui;

import model.Artista;
import model.ArtistaNacional;
import model.ArtistaInternacional;

import java.util.ArrayList;
import java.util.List;

public class ArtistaLoader {

    public static List<Artista> carregarArtistas() {
        List<Artista> artistas = new ArrayList<>();

        // Artistas nacionais
        artistas.add(new ArtistaNacional("Jorge Ben Jor", "Samba", 20, 10));
        artistas.add(new ArtistaNacional("Chico Buarque", "MPB", 20, 10));
        artistas.add(new ArtistaNacional("Milton Nascimento", "MPB", 20, 10));
        artistas.add(new ArtistaNacional("Racionais MC'S", "RAP", 20, 10));
        artistas.add(new ArtistaNacional("Lô Borges", "MPB", 10, 5));
        artistas.add(new ArtistaNacional("Ana Frango Elétrico", "Alternativo", 10, 5));
        artistas.add(new ArtistaNacional("BK", "RAP", 20, 10));
        artistas.add(new ArtistaNacional("Djonga", "RAP", 20, 10));
        artistas.add(new ArtistaNacional("Bella e Olmo da Bruxa", "Alternativo", 3, 2));
        artistas.add(new ArtistaNacional("Yago Oproprio", "RAP", 15, 8));
        artistas.add(new ArtistaNacional("Jorge Aragão", "Samba", 15, 8));
        artistas.add(new ArtistaNacional("Péricles", "Pagode", 20, 10));
        artistas.add(new ArtistaNacional("Thiaguinho", "Pagode", 20, 10));
        artistas.add(new ArtistaNacional("Zeca Pagodinho", "Pagode", 20, 10));
        artistas.add(new ArtistaNacional("Emicida", "Rap", 20, 10));
        artistas.add(new ArtistaNacional("Los Hermano", "Rock", 15, 8));
        artistas.add(new ArtistaNacional("ANAVITORIA", "MPB", 20, 10));
        artistas.add(new ArtistaNacional("Lagum", "Pop", 15, 8));
        artistas.add(new ArtistaNacional("Seu Jorge", "Samba", 20, 10));
        artistas.add(new ArtistaNacional("Iza", "Pop", 20, 10));
        artistas.add(new ArtistaNacional("O Grilo", "Rock", 15, 8));
        artistas.add(new ArtistaNacional("Terno Rei", "Alternativo", 10, 5));
        artistas.add(new ArtistaNacional("O Terno", "Alternativo", 10, 5));
        artistas.add(new ArtistaNacional("Marisa Monte", "MPB", 15, 8));
        artistas.add(new ArtistaNacional("Jovem Dionisio", "Alternativo", 15, 8));

        // Artistas internacionais
        artistas.add(new ArtistaInternacional("The Cure", "Rock", 30, 15));
        artistas.add(new ArtistaInternacional("Tyler, The Creator", "RAP", 30, 15));
        artistas.add(new ArtistaInternacional("Kendrick Lamar", "RAP", 30, 15));
        artistas.add(new ArtistaInternacional("Laufey", "Pop", 25, 13));
        artistas.add(new ArtistaInternacional("Ms Lauryn Hill", "RAP", 30, 15));
        artistas.add(new ArtistaInternacional("Travis Scott", "RAP", 30, 15));
        artistas.add(new ArtistaInternacional("Gorillaz", "Rock", 30, 15));
        artistas.add(new ArtistaInternacional("Bruno Mars", "Pop", 35, 20));
        artistas.add(new ArtistaInternacional("Lady Gaga", "Pop", 35, 20));
        artistas.add(new ArtistaInternacional("Coldplay", "Rock", 35, 20));
        artistas.add(new ArtistaInternacional("Lana del Rey", "Alternativo", 30, 15));
        artistas.add(new ArtistaInternacional("Chapell Roan", "Pop", 30, 15));
        artistas.add(new ArtistaInternacional("Olivia Rodrigo", "Pop", 35, 20));
        artistas.add(new ArtistaInternacional("Billie Eilish", "Pop", 35, 20));
        artistas.add(new ArtistaInternacional("Cage The Elephant", "Alternativo", 25, 15));
        artistas.add(new ArtistaInternacional("Tame Impala", "Alternativo", 30, 15));
        artistas.add(new ArtistaInternacional("The Weeknd", "Pop", 35, 20));
        artistas.add(new ArtistaInternacional("Joji", "Alternativo", 25, 13));

        return artistas;
    }
}
