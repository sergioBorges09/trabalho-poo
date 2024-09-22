package exercicio6;

public class Produto {
    private String nome;
    private double preco;
    private double quantEstoque;

    public Produto(String nome, double preco, double quantEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }
    public double valorTotal() {
        return preco * quantEstoque;
    }
    public void produtoDisponivel() {
        if (quantEstoque > 0) {
            System.out.println("Produto esta disponivel");
        } else {
            System.out.println("Produto esta indisponivel");
        }
    }
}

