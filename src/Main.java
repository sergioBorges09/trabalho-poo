import model.*;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //questao 1 = para calcularArea e o perimetro de um raio
        Circulo circulo = new Circulo(2);
        System.out.println("O resultado do calculo da area de um raio: "+circulo.calcularArea());
        System.out.println(("O resultado do calculo do perimetro de um raio: "+circulo.calcularPerimetro()));
        //questao 2 = Conta bancaria deposito e o saque
        ContaBancaria contabancaria = new ContaBancaria("Sergio Borges",323221,15000);
        contabancaria.depositar(50);
        contabancaria.sacar(20000);
        //questao 3 = Rentagulo calcularArea e o perimetro
        Retangulo retangulo = new Retangulo(20,15);
        System.out.println("O resultado da area: "+retangulo.calcularArea());
        System.out.println("O resultado do perimetro: "+retangulo.calcularPerimetro());
        //questao 4

    }
}


