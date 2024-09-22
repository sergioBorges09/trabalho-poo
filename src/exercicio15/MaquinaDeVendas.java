package exercicio15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Produto: " + nome + ", Preço: R$ " + preco + ", Quantidade: " + quantidade;
    }
}

public class MaquinaDeVendas {
    private List<Produto> produtos;
    private double saldo;

    public MaquinaDeVendas() {
        this.produtos = new ArrayList<>();
        this.saldo = 0.0;
    }

    public void cadastrarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso: " + nome);
    }

    public void exibirEstoque() {
        if (produtos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            System.out.println("Estoque de produtos:");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println((i + 1) + ". " + produtos.get(i));
            }
        }
    }

    public Produto selecionarProduto(int indiceProduto) {
        if (indiceProduto > 0 && indiceProduto <= produtos.size()) {
            Produto produto = produtos.get(indiceProduto - 1);
            if (produto.getQuantidade() > 0) {
                return produto;
            } else {
                System.out.println("Produto esgotado.");
            }
        } else {
            System.out.println("Produto inválido.");
        }
        return null;
    }

    public void inserirDinheiro(double valor) {
        saldo += valor;
        System.out.println("Você inseriu R$ " + valor);
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void comprarProduto(Produto produto) {
        if (produto != null) {
            if (saldo >= produto.getPreco()) {
                saldo -= produto.getPreco();
                produto.setQuantidade(produto.getQuantidade() - 1);
                System.out.println("Você comprou: " + produto.getNome());
                System.out.println("Troco: R$ " + calcularTroco());
            } else {
                System.out.println("Saldo insuficiente para comprar " + produto.getNome());
            }
        }
    }

    public double calcularTroco() {
        double troco = saldo;
        saldo = 0;  // Após dar o troco, o saldo é zerado
        return troco;
    }
}

