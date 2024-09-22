package exercicio10;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponivel;

    public Livro(boolean disponivel) {
        this.disponivel = true;
    }

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public boolean emprestarLivro(){
        if(disponivel){
            disponivel = false;
            System.out.println("Emprestado com sucesso!");
            return true;
        }else{
            System.out.println("Livro nao disponivel!");
            return false;
        }
    }
    public void devolverLivro(){
        if(!disponivel){
            disponivel = true;
            System.out.println("Devolvido com sucesso!");
        }else{
            System.out.println("Livro ja esta disponivel!");
        }
    }
    public boolean isDisponivel(){
        return disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
