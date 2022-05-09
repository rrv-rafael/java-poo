package br.com.rrvrafael.myapp.app;

import java.util.Scanner;

import br.com.rrvrafael.myapp.classes.Carro;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            Carro corsa = new Carro();

            corsa.setNome("Corsa");
            corsa.setMarca("Chevrolett");
            corsa.setQuantidadeRodas(4);
            corsa.setChassi("ABCDE");

            System.out.println("\nNome do veículo: " + corsa.getNome());
            System.out.println("Marca do veículo: " + corsa.getMarca());
            System.out.println("Quantidade de rodas do veículo: " + corsa.getQuantidadeRodas());
            System.out.println("Número do chassi do veículo: " + corsa.getChassi());

            corsa.ligar();
            corsa.abastecer(35);

            System.out.println(corsa.getQuantidadeCombustivel());
        } catch (Exception e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        scan.close();
    }
}
