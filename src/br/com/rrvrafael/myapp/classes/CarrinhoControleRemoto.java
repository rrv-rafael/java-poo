package br.com.rrvrafael.myapp.classes;

import br.com.rrvrafael.myapp.exceptions.AceleracaoVeiculoLigadoException;
import br.com.rrvrafael.myapp.exceptions.FrenagemVeiculoDesligadoException;
import br.com.rrvrafael.myapp.interfaces.Andador;
import br.com.rrvrafael.myapp.interfaces.Ligador;

public class CarrinhoControleRemoto implements Ligador, Andador {
    @Override
    public void acelerar() throws AceleracaoVeiculoLigadoException {        
    }

    @Override
    public void frear() throws FrenagemVeiculoDesligadoException {
    }

    @Override
    public void ligar() {
    }

    @Override
    public void desligar() {
    }
}
