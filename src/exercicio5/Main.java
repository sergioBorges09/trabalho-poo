package exercicio5;

import model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Sergio Borges","Gerente",15000.00);
        System.out.println("Seu salario descontado dos impostos: "+funcionario.calcularSalarioLiquido(200));
    }
}
