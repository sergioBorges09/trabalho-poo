package exercicio16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    public Baralho() {
        this.cartas = new ArrayList<>();
        inicializarBaralho();
    }
    private void inicializarBaralho() {
        String[] cores = {"Vermelho", "Azul", "Verde", "Amarelo"};
        for (String cor : cores) {
            for (int numero = 0; numero <= 9; numero++) {
                cartas.add(new Carta(cor, numero));
                cartas.add(new Carta(cor, numero));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }
    public Carta distribuirCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        }
        return null;
    }
    public boolean temCartas() {
        return !cartas.isEmpty();
    }
}

