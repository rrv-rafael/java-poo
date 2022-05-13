package br.com.rrvrafael.myapp.interfaces;

import br.com.rrvrafael.myapp.exceptions.AceleracaoVeiculoLigadoException;
import br.com.rrvrafael.myapp.exceptions.FrenagemVeiculoDesligadoException;

public interface Andador {
    void acelerar() throws AceleracaoVeiculoLigadoException;
    void frear() throws FrenagemVeiculoDesligadoException;
}
