package service;

public class OrcamentoInsuficienteException extends Exception {

    public OrcamentoInsuficienteException(double valorNecessario) {
        super("Orçamento insuficiente. Você precisa de R$ " + valorNecessario + " para adicionar este artista.");
    }
}
