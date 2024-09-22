package exercicio16;

public class Main {
    public static void main(String[] args) {
        JogoCartas jogo = new JogoCartas(2);
        jogo.exibirMaos();
        jogo.realizarJogada(0, 2);
        jogo.exibirUltimaCartaJogada();
    }

}
