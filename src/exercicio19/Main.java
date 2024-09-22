package exercicio19;

public class Main {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();

        calendario.exibirCalendario(1, 2024);

        Data dataFeriado = new Data(1, 1, 2024);
        System.out.println("É feriado? " + calendario.verificarFeriado(dataFeriado));

        Data data1 = new Data(1, 1, 2024);
        Data data2 = new Data(25, 12, 2024);
        long diasDeDiferenca = calendario.calcularDiferencaDias(data1, data2);
        System.out.println("Diferença de dias: " + diasDeDiferenca);
    }
}

