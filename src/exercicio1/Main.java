package exercicio1;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        System.out.println("O resultado do calculo da area: " + circulo.calcularArea());
        System.out.println("O resultado do calculo do perimetro: " + circulo.calcularPerimetro());
    }
}
