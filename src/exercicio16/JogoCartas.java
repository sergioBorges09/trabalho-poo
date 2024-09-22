package exercicio16;

import java.util.ArrayList;
import java.util.List;

public class JogoCartas {
    private Baralho baralho;
    private List<Jogador> jogadores;
    private Carta ultimaCartaJogada;

    public JogoCartas(int numeroJogadores) {
        baralho = new Baralho();
        baralho.embaralhar();
        jogadores = new ArrayList<>();

        for (int i = 1; i <= numeroJogadores; i++) {
            jogadores.add(new Jogador("Jogador " + i));
        }

        distribuirCartas();
    }

    private void distribuirCartas() {
        int cartasPorJogador = 5;
        for (int i = 0; i < cartasPorJogador; i++) {
            for (Jogador jogador : jogadores) {
                Carta carta = baralho.distribuirCarta();
                if (carta != null) {
                    jogador.receberCarta(carta);
                }
            }
        }
    }

    public void exibirMaos() {
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }

    public boolean realizarJogada(int jogadorIndex, int cartaIndex) {
        if (jogadorIndex >= 0 && jogadorIndex < jogadores.size()) {
            Jogador jogador = jogadores.get(jogadorIndex);
            Carta carta = jogador.jogarCarta(cartaIndex);

            if (carta != null) {
                ultimaCartaJogada = carta;
                System.out.println("Jogador " + (jogadorIndex + 1) + " jogou: " + carta);
                return true;
            }
        }
        return false;
    }

    public void exibirUltimaCartaJogada() {
        if (ultimaCartaJogada != null) {
            System.out.println("Última carta jogada: " + ultimaCartaJogada);
        } else {
            System.out.println("Nenhuma carta foi jogada ainda.");
        }
    }

    public static void main(String[] args) {
        JogoCartas jogo = new JogoCartas(2);
        jogo.exibirMaos();
        jogo.realizarJogada(0, 2);
        jogo.exibirUltimaCartaJogada();
    }
}

