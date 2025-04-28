package main.ecommerce.core.domain.entity;

import java.util.List;

public class Carrinho {
    List<Produto> produtos;
    float valorTotal;

    public Carrinho(List<Produto> produtos, float valorTotal) {
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "produtos=" + produtos +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
