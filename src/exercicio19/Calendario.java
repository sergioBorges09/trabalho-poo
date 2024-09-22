package exercicio19;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

class Calendario {
    private Set<LocalDate> feriados;

    public Calendario() {
        feriados = new HashSet<>();
        cadastrarFeriados();
    }

    private void cadastrarFeriados() {
        feriados.add(LocalDate.of(2024, 1, 1));
        feriados.add(LocalDate.of(2024, 12, 25));
    }

    public void exibirCalendario(int mes, int ano) {
        System.out.println("Calendário de " + Month.of(mes) + " de " + ano);
        System.out.println("Dom Seg Ter Qua Qui Sex Sab");

        LocalDate primeiroDia = LocalDate.of(ano, mes, 1);
        int diaDaSemana = primeiroDia.getDayOfWeek().getValue() % 7; // Ajusta para que domingo seja 0

        // Exibe espaços em branco para os dias anteriores ao primeiro dia do mês
        for (int i = 0; i < diaDaSemana; i++) {
            System.out.print("    ");
        }

        // Exibe os dias do mês
        int diasNoMes = primeiroDia.lengthOfMonth();
        for (int dia = 1; dia <= diasNoMes; dia++) {
            System.out.printf("%2d  ", dia);
            if ((dia + diaDaSemana) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public boolean verificarFeriado(Data data) {
        return feriados.contains(data.getData());
    }

    public long calcularDiferencaDias(Data data1, Data data2) {
        return Math.abs(data1.getData().toEpochDay() - data2.getData().toEpochDay());
    }
}
