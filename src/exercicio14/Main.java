package exercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Editar contato");
            System.out.println("3. Remover contato");
            System.out.println("4. Buscar contato por nome");
            System.out.println("5. Buscar contato por telefone");
            System.out.println("6. Exibir todos os contatos");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    agenda.adicionarContato(nome, telefone);
                    break;
                case 2:
                    System.out.print("Nome do contato a editar: ");
                    String nomeEditar = scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo telefone: ");
                    String novoTelefone = scanner.nextLine();
                    agenda.editarContato(nomeEditar, novoNome, novoTelefone);
                    break;
                case 3:
                    System.out.print("Nome do contato a remover: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;
                case 4:
                    System.out.print("Nome do contato a buscar: ");
                    String nomeBuscar = scanner.nextLine();
                    Contato contatoPorNome = agenda.buscarContatoPorNome(nomeBuscar);
                    if (contatoPorNome != null) {
                        System.out.println(contatoPorNome);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Telefone do contato a buscar: ");
                    String telefoneBuscar = scanner.nextLine();
                    Contato contatoPorTelefone = agenda.buscarContatoPorTelefone(telefoneBuscar);
                    if (contatoPorTelefone != null) {
                        System.out.println(contatoPorTelefone);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 6:
                    agenda.exibirContatos();
                    break;
                case 7:
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
