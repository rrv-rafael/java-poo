package br.com.rrvrafael.myapp.exceptions;

public class ChassiInvalidoException extends Exception {
    public ChassiInvalidoException(String chassi) {
        super(String.format("O chassi [%s] é inválido!", chassi));
    }
}
