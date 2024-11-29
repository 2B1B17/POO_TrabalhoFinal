package service;

import model.Artista;

import java.util.ArrayList;
import java.util.List;

public class Festival {
    private double orcamento;
    private List<Artista> artistas;

    public Festival(double orcamento) {
        this.orcamento = orcamento;
        this.artistas = new ArrayList<>();
    }

    public boolean adicionarArtista(Artista artista) throws service.OrcamentoInsuficienteException {
        if (orcamento >= artista.getCache()) {
            artistas.add(artista);
            orcamento -= artista.getCache();
            return true;
        } else {
            throw new service.OrcamentoInsuficienteException(artista.getCache());
        }
    }

    public void mostrarFestival() {
        System.out.println("Festival com os seguintes artistas:");
        for (Artista artista : artistas) {
            System.out.println(artista.getNome() + " - Gênero: " + artista.getGenero() + ", Cache: R$ " + artista.getCache());
        }
        System.out.println("Orçamento restante: R$ " + orcamento);
    }

    public void apresentarShows() {
        for (Artista artista : artistas) {
            // Polimorfismo em ação: o método apresentarShow será chamado de acordo com a classe real do objeto
            artista.apresentarShow();
        }
    }

    public double getOrcamento() {
        return orcamento;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }
}
