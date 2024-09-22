package exercicio3;

public class Retangulo {
    private double retangulo;

    public Retangulo(double retangulo) {
        this.retangulo = retangulo;
    }
    public double calcularArea() {
        return retangulo * retangulo;
    }
    public double calcularPerimetro() {
        return retangulo * 2;
    }
}
