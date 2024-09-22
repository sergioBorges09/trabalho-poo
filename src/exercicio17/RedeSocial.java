package exercicio17;

import java.util.ArrayList;
import java.util.List;

class RedeSocial {
    private List<Usuario> usuarios;

    public RedeSocial() {
        usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        if (!usuarios.contains(usuario)) {
            usuarios.add(usuario);
            System.out.println(usuario.getNome() + " se juntou à rede social!");
        } else {
            System.out.println(usuario.getNome() + " já está na rede social!");
        }
    }

    public Usuario buscarUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        System.out.println("Usuário não encontrado!");
        return null;
    }

    public void listarUsuarios() {
        System.out.println("Usuários na rede social:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome());
        }
    }
}

