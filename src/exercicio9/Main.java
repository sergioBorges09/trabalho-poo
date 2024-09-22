package exercicio9;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("João", 30);

        paciente.adicionarConsulta("Consulta com cardiologista - 10/09/2023");
        paciente.adicionarConsulta("Exame de sangue - 15/09/2023");

        paciente.exibirConsultas();
    }
}
