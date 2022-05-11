package br.com.rrvrafael.myapp.exceptions;

public class FrenagemVeiculoDesligadoException extends Exception {
    public FrenagemVeiculoDesligadoException() {
        super("Não há necessidade de frear. O veículo está desligado!");
    }
}
