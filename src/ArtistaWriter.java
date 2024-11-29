package service;

import model.Artista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ArtistaWriter {

    private static final String ARQUIVO = "lineup.txt";

    // Método para escrever a lineup no arquivo
    public static void escreverLineup(List<Artista> artistas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Artista artista : artistas) {
                writer.write(artista.getNome() + " - " + artista.getGenero() + " - R$ " + artista.getCache());
                writer.newLine();
            }
            System.out.println("Lineup escrito com sucesso no arquivo.");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    // Método para ler o lineup do arquivo
    public static void lerLineup() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
