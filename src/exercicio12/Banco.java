package exercicio12;

import java.util.ArrayList;
import java.util.HashMap;

class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
}
class ContaBancaria {
    private Cliente cliente;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(Cliente cliente, int numeroConta) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            return false;
        }
    }

    public boolean transferir(ContaBancaria destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para a conta " + destino.getNumeroConta() + " realizada com sucesso.");
            return true;
        }
        return false;
    }
}

public class Banco {
    private String nomeBanco;
    private ArrayList<Cliente> clientes;
    private HashMap<Integer, ContaBancaria> contasBancarias;
    private int proximoNumeroConta;

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        this.clientes = new ArrayList<>();
        this.contasBancarias = new HashMap<>();
        this.proximoNumeroConta = 1;
    }

    public Cliente cadastrarCliente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        clientes.add(cliente);
        System.out.println("Cliente " + nome + " cadastrado com sucesso.");
        return cliente;
    }

    public ContaBancaria abrirConta(Cliente cliente) {
        ContaBancaria novaConta = new ContaBancaria(cliente, proximoNumeroConta);
        contasBancarias.put(proximoNumeroConta, novaConta);
        System.out.println("Conta número " + proximoNumeroConta + " aberta para o cliente " + cliente.getNome() + ".");
        proximoNumeroConta++;
        return novaConta;
    }

    public ContaBancaria obterConta(int numeroConta) {
        return contasBancarias.get(numeroConta);
    }

    public void exibirInformacoesBanco() {
        System.out.println("Banco: " + nomeBanco);
        System.out.println("Número de clientes: " + clientes.size());
        System.out.println("Número de contas ativas: " + contasBancarias.size());
    }
}

