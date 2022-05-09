package br.com.rrvrafael.myapp.classes;

import br.com.rrvrafael.myapp.exceptions.ChassiInvalidoException;

public class Veiculo {
    private String nome;
    private String marca;
    private String chassi;
    private int quantidadeRodas;
    private double quantidadeCombustivel;
    
    public Veiculo() {
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

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public void ligar() {
        System.out.println("O carro foi ligado!");
    }

    public void desligar() {
        System.out.println("O carro foi desligado");
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void abastecer(double quantidadeLitros) {
        quantidadeCombustivel += quantidadeLitros;
    }
}
