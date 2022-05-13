package br.com.rrvrafael.myapp.interfaces;

import br.com.rrvrafael.myapp.exceptions.AbastecimentoVeiculoLigadoException;
import br.com.rrvrafael.myapp.exceptions.AceleracaoVeiculoLigadoException;

public interface Veiculo {
    void abastecer(double quantidadeLitros) throws AbastecimentoVeiculoLigadoException;
    void acelerar() throws AceleracaoVeiculoLigadoException;
}
