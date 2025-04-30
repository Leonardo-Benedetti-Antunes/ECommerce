package main.ecommerce.core.dto;

import main.ecommerce.core.domain.enums.Unidades;

public class ProdutoDTO {
    private String nome;
    private String descricao;
    private float valor;
    private Unidades unidade;

    public ProdutoDTO(String nome, String descricao, float valor, Unidades unidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.unidade = unidade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public Unidades getUnidade() {
        return unidade;
    }

    @Override
    public String toString() {
        return nome + " - " + descricao + " | R$" + valor + " por " + unidade;
    }
}
