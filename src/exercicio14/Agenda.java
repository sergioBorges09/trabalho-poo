package exercicio14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        Contato contato = new Contato(nome, telefone);
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso.");
    }

    public void editarContato(String nome, String novoNome, String novoTelefone) {
        Contato contato = buscarContatoPorNome(nome);
        if (contato != null) {
            contato.setNome(novoNome);
            contato.setTelefone(novoTelefone);
            System.out.println("Contato atualizado com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void removerContato(String nome) {
        Contato contato = buscarContatoPorNome(nome);
        if (contato != null) {
            contatos.remove(contato);
            System.out.println("Contato removido com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public Contato buscarContatoPorTelefone(String telefone) {
        for (Contato contato : contatos) {
            if (contato.getTelefone().equals(telefone)) {
                return contato;
            }
        }
        return null;
    }

    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato na agenda.");
        } else {
            System.out.println("Contatos na agenda:");
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
}
