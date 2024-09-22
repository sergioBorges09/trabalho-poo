package exercicio12;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Exemplo");

        Cliente cliente1 = banco.cadastrarCliente("João", "123.456.789-00");
        Cliente cliente2 = banco.cadastrarCliente("Maria", "987.654.321-00");

        ContaBancaria conta1 = banco.abrirConta(cliente1);
        ContaBancaria conta2 = banco.abrirConta(cliente2);

        conta1.depositar(500);
        conta1.sacar(100);
        conta1.transferir(conta2, 200);

        banco.exibirInformacoesBanco();
    }
}

