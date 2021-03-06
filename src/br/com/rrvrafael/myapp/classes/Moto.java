package br.com.rrvrafael.myapp.classes;

import br.com.rrvrafael.myapp.exceptions.AceleracaoVeiculoLigadoException;
import br.com.rrvrafael.myapp.exceptions.FrenagemVeiculoDesligadoException;

public final class Moto extends VeiculoBase {
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

    @Override
    public void preparar() {
        System.out.println("Colocar capacete!");        
    }
}
