package exercicio2;

import model.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contabancaria = new ContaBancaria("Sergio Borges",23434342,1500);
        contabancaria.depositar(100);
        contabancaria.sacar(20000);
    }
}
