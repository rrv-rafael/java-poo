package br.com.rrvrafael.myapp.classes;

import br.com.rrvrafael.myapp.exceptions.AbastecimentoVeiculoLigadoException;
import br.com.rrvrafael.myapp.exceptions.AceleracaoVeiculoLigadoException;
import br.com.rrvrafael.myapp.exceptions.ChassiInvalidoException;
import br.com.rrvrafael.myapp.exceptions.FrenagemVeiculoDesligadoException;

public class Veiculo {
    private String nome;
    private String marca;
    private String chassi;
    protected int quantidadeRodas;
    private double quantidadeCombustivel;
    private boolean ligado;
    protected double velocidade;
    
    public Veiculo() {
        ligado = false;
        velocidade = 0;
    }

    public Veiculo(String nome, String marca, String chassi, int quantidadeRodas) {
        this.nome = nome;
        this.marca = marca;
        this.chassi = chassi;
        this.quantidadeRodas = quantidadeRodas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) throws ChassiInvalidoException {
        if (chassi.length() == 5) {
            this.chassi = chassi;
        } else {            
            throw new ChassiInvalidoException(chassi);
        }        
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public boolean isLigado() {
        return ligado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void ligar() {
        ligado = true;
        velocidade = 0;
        System.out.println("O carro foi ligado!");
    }

    public void desligar() {
        ligado = false;
        velocidade = 0;
        System.out.println("O carro foi desligado");
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void abastecer(double quantidadeLitros) throws AbastecimentoVeiculoLigadoException {
        if (!isLigado()) {
            quantidadeCombustivel += quantidadeLitros;
        } else {
            throw new AbastecimentoVeiculoLigadoException();
        }
    }

    public void acelerar() throws AceleracaoVeiculoLigadoException {
        if (ligado) {
            velocidade += 10;
        } else {
            throw new AceleracaoVeiculoLigadoException();
        }
    }

    public void frear() throws FrenagemVeiculoDesligadoException {
        if (ligado) {
            velocidade -= 10;
        } else {
            throw new FrenagemVeiculoDesligadoException();
        }
    }
}
