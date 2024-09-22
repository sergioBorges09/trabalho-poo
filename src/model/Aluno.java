package model;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int matricula;
    private ArrayList<Double> notas;

    public Aluno(String nome, int matricula, ArrayList<Double> notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

}
