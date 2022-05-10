package br.com.rrvrafael.myapp.classes;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro() {
        quantidadeRodas = 4;
    }

    public Carro(String nome, String marca) {
        quantidadeRodas = 4;
        this.setNome(nome);
        this.setMarca(marca);
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    
}
