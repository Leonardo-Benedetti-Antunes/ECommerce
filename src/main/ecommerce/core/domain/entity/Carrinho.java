package main.ecommerce.core.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    List<Produto> produtos;
    List<Float> quantidadeProdutos;
    float valorTotal;

    public Carrinho() {
        this.produtos = new ArrayList<>();
        this.quantidadeProdutos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Float> getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeProdutos(List<Float> quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void addProdutos(Produto produto, float quantidade) {
        this.produtos.add(produto);
        this.quantidadeProdutos.add(quantidade);
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "produtos=" + produtos +
                ", quantidadeProdutos=" + quantidadeProdutos +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
