package br.com.rrvrafael.myapp.app;

import java.util.Scanner;

import br.com.rrvrafael.myapp.classes.Carro;
import br.com.rrvrafael.myapp.classes.Moto;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            Carro corsa = new Carro("Corsa", "GM");
            corsa.setChassi("ABCDE");
            corsa.setQuantidadePortas(4);

            System.out.println("\nNome do veículo: " + corsa.getNome());
            System.out.println("Marca do veículo: " + corsa.getMarca());
            System.out.println("Quantidade de rodas do veículo: " + corsa.getQuantidadeRodas());
            System.out.println("Número do chassi do veículo: " + corsa.getChassi());
            System.out.println("Número de portas do veículo: " + corsa.getQuantidadePortas());
            System.out.println("Carro ligado: " + corsa.isLigado());

            corsa.abastecer(35);
            System.out.printf("Foram abastecidos %.2f litros.\n", corsa.getQuantidadeCombustivel());
            corsa.ligar();
            corsa.abastecer(50);

            Moto titan = new Moto("CG", "Honda");
            titan.setChassi("EFDGK");

            System.out.println("\nNome do veículo: " + titan.getNome());
            System.out.println("Marca do veículo: " + titan.getMarca());
            System.out.println("Quantidade de rodas do veículo: " + titan.getQuantidadeRodas());
            System.out.println("Número do chassi do veículo: " + titan.getChassi());
            System.out.println("Moto ligada: " + titan.isLigado());

            System.out.printf("Foram abastecidos %.2f litros.\n", corsa.getQuantidadeCombustivel());
        } catch (Exception e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        scan.close();
    }
}
