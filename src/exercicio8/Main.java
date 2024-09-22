package exercicio8;

public class Main  {
    public static void main(String[] args) {
        Carro carro = new Carro("Audi","AQ",150);
       carro.acelerar(10);
       carro.frear(20);
       carro.exibirVelocidade();
    }
}
