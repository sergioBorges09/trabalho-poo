package exercicio4;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int matricula;
    private ArrayList<Double> notas = new ArrayList<>();

    public Aluno(int matricula, ArrayList<Double> notas, String nome) {
        this.matricula = matricula;
        this.notas = notas;
        this.nome = nome;
    }
    public double calcularMedia() {
        double media = 0;
        for (Double nota : notas) {
            media += nota;
        }
        return media / notas.size();
    }
    public void situacaoAluno(){
        if(notas.size() >= 60){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
}
