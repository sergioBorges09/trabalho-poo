package exercicio18;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);

        biblioteca.verificarDisponibilidade("O Senhor dos Anéis");
        biblioteca.emprestarLivro("O Senhor dos Anéis");
        biblioteca.verificarDisponibilidade("O Senhor dos Anéis");
        biblioteca.devolverLivro("O Senhor dos Anéis");
        biblioteca.verificarDisponibilidade("O Senhor dos Anéis");
    }
}
