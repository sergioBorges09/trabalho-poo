package exercicio17;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private List<Usuario> amigos;
    private List<String> posts;

    public Usuario(String nome) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public List<String> getPosts() {
        return posts;
    }

    public void adicionarAmigo(Usuario amigo) {
        if (!amigos.contains(amigo) && !amigo.equals(this)) {
            amigos.add(amigo);
            amigo.amigos.add(this);
            System.out.println(nome + " agora é amigo de " + amigo.getNome());
        } else {
            System.out.println(nome + " já é amigo de " + amigo.getNome());
        }
    }

    public void publicarMensagem(String mensagem) {
        posts.add(mensagem);
        System.out.println(nome + " publicou: " + mensagem);
    }

    public void comentarPost(String mensagem) {
        System.out.println(nome + " comentou: " + mensagem);
    }
}

