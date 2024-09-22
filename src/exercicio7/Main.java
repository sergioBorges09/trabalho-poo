package exercicio7;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(2,3,4);
        if (triangulo.ehValido()) {
            System.out.println("O triângulo é válido.");
            System.out.println("Área do triângulo: " + triangulo.calcularArea());
        } else {
            System.out.println("O triângulo não é válido.");
        }
    }
    }
