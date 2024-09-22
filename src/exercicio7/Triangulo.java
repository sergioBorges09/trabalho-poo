package exercicio7;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public boolean ehValido() {
        // A soma de dois lados deve ser maior que o terceiro lado
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    // Método para calcular a área do triângulo usando a fórmula de Herão
    public double calcularArea() {
        if (ehValido()) {
            // Semiperímetro
            double s = (lado1 + lado2 + lado3) / 2;
            // Fórmula de Herão para calcular a área
            return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        } else {
            throw new IllegalArgumentException("Os lados fornecidos não formam um triângulo válido.");
        }
    }

    // Getters e Setters (opcionais)
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
}
