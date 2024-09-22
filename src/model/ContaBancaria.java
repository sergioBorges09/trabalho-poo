package model;

public class ContaBancaria {
    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nomeTitular, int numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
        System.out.println("Saldo atual: " + saldo);
    }
    public void sacar(double valor){
        if(saldo >= valor){
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        }else{
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo atual: " + saldo);
        }
    }
}
