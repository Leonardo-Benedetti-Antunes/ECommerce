package main.ecommerce.core.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    List<Produto> produtos;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProdutos(Produto produto) {
        this.produtos.add(produto);
    }
}
