package br.com.rrvrafael.myapp.exceptions;

public class AbastecimentoVeiculoLigadoException extends Exception {
    public AbastecimentoVeiculoLigadoException() {
        super("Não é possível abastecer, o veículo está ligado!");
    }
}
