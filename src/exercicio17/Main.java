package exercicio17;

public class Main {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();

        Usuario usuario1 = new Usuario("Alice");
        Usuario usuario2 = new Usuario("Bob");

        redeSocial.adicionarUsuario(usuario1);
        redeSocial.adicionarUsuario(usuario2);

        usuario1.adicionarAmigo(usuario2);
        usuario1.publicarMensagem("Olá, pessoal!");
        usuario2.comentarPost("Que legal, Alice!");

        redeSocial.listarUsuarios();

        Usuario encontrado = redeSocial.buscarUsuario("Alice");
        if (encontrado != null) {
            System.out.println("Usuário encontrado: " + encontrado.getNome());
        }
    }
}

