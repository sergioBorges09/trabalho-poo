package exercicio19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Data {
    private LocalDate data;

    public Data(int dia, int mes, int ano) {
        this.data = LocalDate.of(ano, mes, dia);
    }

    public LocalDate getData() {
        return data;
    }

    public String formatarData(String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        return data.format(formatter);
    }
}

