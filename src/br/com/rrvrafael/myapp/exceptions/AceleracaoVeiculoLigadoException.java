package br.com.rrvrafael.myapp.exceptions;

public class AceleracaoVeiculoLigadoException extends Exception {
    public AceleracaoVeiculoLigadoException() {
        super("Não é possível acelerar com o veículo desligado!");
    }
}
