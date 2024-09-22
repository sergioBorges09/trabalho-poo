package model;

public class Circulo {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }
}
