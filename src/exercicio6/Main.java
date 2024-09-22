package exercicio6;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Arroz",7.50,0);
        System.out.println("O valor total: "+produto.valorTotal());
        produto.produtoDisponivel();
    }
}
