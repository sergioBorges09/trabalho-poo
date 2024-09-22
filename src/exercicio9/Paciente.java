package exercicio9;

import java.util.ArrayList;

public class Paciente {
    private String nome;
    private int idade;
    private ArrayList<String> historicoConsultas;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.historicoConsultas = new ArrayList<>();
    }

    public void adicionarConsulta(String consulta) {
        historicoConsultas.add(consulta);
    }
    public void exibirConsultas() {
        if (historicoConsultas.isEmpty()) {
            System.out.println("Nenhuma consulta realizada.");
        } else {
            System.out.println("Histórico de Consultas:");
            for (String consulta : historicoConsultas) {
                System.out.println(consulta);
            }
        }
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
}

