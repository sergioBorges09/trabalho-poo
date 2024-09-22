package exercicio18;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado: " + livro.getTitulo() + " por " + livro.getAutor());
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel()) {
                    livro.setDisponivel(false);
                    System.out.println("Livro emprestado: " + livro.getTitulo());
                    return;
                } else {
                    System.out.println("Livro não está disponível para empréstimo.");
                    return;
                }
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!livro.isDisponivel()) {
                    livro.setDisponivel(true);
                    System.out.println("Livro devolvido: " + livro.getTitulo());
                    return;
                } else {
                    System.out.println("Este livro já está disponível.");
                    return;
                }
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void verificarDisponibilidade(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel()) {
                    System.out.println("O livro " + livro.getTitulo() + " está disponível.");
                } else {
                    System.out.println("O livro " + livro.getTitulo() + " não está disponível.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}

