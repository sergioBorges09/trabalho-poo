package exercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaquinaDeVendas maquina = new MaquinaDeVendas();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Cadastrando alguns produtos iniciais
        maquina.cadastrarProduto("Coca-Cola", 5.00, 10);
        maquina.cadastrarProduto("Chocolate", 3.50, 5);
        maquina.cadastrarProduto("Batata Chips", 4.25, 7);

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Exibir estoque");
            System.out.println("2. Inserir dinheiro");
            System.out.println("3. Selecionar produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    maquina.exibirEstoque();
                    break;
                case 2:
                    System.out.print("Digite o valor a inserir: R$ ");
                    double valor = scanner.nextDouble();
                    maquina.inserirDinheiro(valor);
                    break;
                case 3:
                    maquina.exibirEstoque();
                    System.out.print("Selecione o número do produto: ");
                    int indiceProduto = scanner.nextInt();
                    Produto produtoSelecionado = maquina.selecionarProduto(indiceProduto);
                    maquina.comprarProduto(produtoSelecionado);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
