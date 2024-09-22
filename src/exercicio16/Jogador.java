package exercicio16;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Carta> mao;

    public Jogador(String nome) {
        this.nome = nome;
        this.mao = new ArrayList<>();
    }

    public void receberCarta(Carta carta) {
        mao.add(carta);
    }

    public Carta jogarCarta(int indice) {
        if (indice >= 0 && indice < mao.size()) {
            return mao.remove(indice);
        }
        return null;
    }

    public List<Carta> getMao() {
        return mao;
    }

    public String toString() {
        return nome + " com mão: " + mao;
    }
}

