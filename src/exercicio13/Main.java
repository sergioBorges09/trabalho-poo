package exercicio13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual(1, "Minha Loja", "Loja de produtos variados");

        Produto p1 = new Produto("Notebook", 3000);
        Produto p2 = new Produto("Smartphone", 1500);
        loja.cadastrarProduto(p1);
        loja.cadastrarProduto(p2);

        List<Compra> compras = new ArrayList<>();
        compras.add(new Compra(p1, 1));
        compras.add(new Compra(p2, 2));

        loja.gerarCarrinhoDeCompras(compras, 10);
    }
}
