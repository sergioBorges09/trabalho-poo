package exercicio2;

public class ContaBancaria {
    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(double saldo, int numeroConta, String nomeTitular) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }
    public void depositar(double valor) {
        saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
    }
    public void sacar(double valor) {
        if(valor >= saldo) {
            System.out.println("Saque realizado com sucesso");
            System.out.println("Saldo atual: " + saldo);
        }else{
            System.out.println("O valor do saque invalido");
            System.out.println("O valor do saque: " + saldo);
        }
    }
}
