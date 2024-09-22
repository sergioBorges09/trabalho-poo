package exercicio8;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, double velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }
    public void acelerar(double incremento){
        if(incremento > 0){
            velocidadeAtual += incremento;
            System.out.println("Velocidade Atual: " + velocidadeAtual);
        }else{
            System.out.println("Velocidade do carro deve ser positivo");
        }
    }
    public void frear(double decremento){
        if(decremento > 0){
            velocidadeAtual -= decremento;
            System.out.println("Velocidade Atual: " +decremento + "KM/H");
        }else{
            System.out.println("Frear tem que ser positivo");
        }
    }
    public void exibirVelocidade(){
        System.out.println("Velocidade Atual: " + velocidadeAtual);
    }
}
