package main.ecommerce.core.domain.entity;

import java.util.List;

public class Estoque {
    List<Produto> produtos;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
