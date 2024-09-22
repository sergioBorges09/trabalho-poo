package exercicio16;

public class Carta {
    private String cor;
    private int numero;

    public Carta(String cor, int numero) {
        this.cor = cor;
        this.numero = numero;
    }

    public String getCor() {
        return cor;
    }

    public int getNumero() {
        return numero;
    }

    public String toString() {
        return cor + " " + numero;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Carta carta = (Carta) obj;
        return numero == carta.numero && cor.equals(carta.cor);
    }

    public int hashCode() {
        return cor.hashCode() * 31 + numero;
    }
}
