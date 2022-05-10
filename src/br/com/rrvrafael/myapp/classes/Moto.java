package br.com.rrvrafael.myapp.classes;

public class Moto extends Veiculo {
    public Moto() {
        quantidadeRodas = 2;
    }

    public Moto(String nome, String marca) {
        quantidadeRodas = 2;
        this.setNome(nome);
        this.setMarca(marca);
    }
}
