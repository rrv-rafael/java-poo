package br.com.rrvrafael.myapp.classes;

import br.com.rrvrafael.myapp.exceptions.AceleracaoVeiculoLigadoException;
import br.com.rrvrafael.myapp.exceptions.FrenagemVeiculoDesligadoException;

public class Moto extends Veiculo {
    public Moto() {
        quantidadeRodas = 2;
    }

    public Moto(String nome, String marca) {
        quantidadeRodas = 2;
        this.setNome(nome);
        this.setMarca(marca);
    }

    @Override
    public void acelerar() throws AceleracaoVeiculoLigadoException {
        if (this.isLigado()) {
            velocidade += 3;
        } else {
            throw new AceleracaoVeiculoLigadoException();
        }
    }

    @Override
    public void frear() throws FrenagemVeiculoDesligadoException {
        if (this.isLigado()) {
            velocidade -= 3;
        } else {
            throw new FrenagemVeiculoDesligadoException();
        }
    }
}
