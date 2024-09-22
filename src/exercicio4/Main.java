package exercicio4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(5.0);
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);
        Aluno aluno = new Aluno(32332,notas,"Sergio Borges");
        System.out.println("A sua media: "+aluno.calcularMedia());
        aluno.situacaoAluno();
    }
}
