package br.com.rrvrafael.myapp.classes;

import br.com.rrvrafael.myapp.exceptions.AbastecimentoVeiculoLigadoException;
import br.com.rrvrafael.myapp.exceptions.ChassiInvalidoException;

public class Veiculo {
    private String nome;
    private String marca;
    private String chassi;
    protected int quantidadeRodas;
    private double quantidadeCombustivel;
    private boolean ligado;
    
    public Veiculo() {
        ligado = false;
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

    public void setChassi(String chassi) throws Exception {
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

    public void ligar() {
        ligado = true;
        System.out.println("O carro foi ligado!");
    }

    public void desligar() {
        ligado = false;
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
}
