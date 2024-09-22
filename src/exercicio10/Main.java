package exercicio10;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Diaro de um banana","Jhoson",560);
        livro.emprestarLivro();
        System.out.println(("Disponivel? "+livro.isDisponivel()));
        livro.emprestarLivro();
        livro.devolverLivro();
        System.out.println("Disponível? "+livro.isDisponivel());
    }
}
