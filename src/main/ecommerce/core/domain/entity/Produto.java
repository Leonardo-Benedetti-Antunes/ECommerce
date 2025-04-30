package main.ecommerce.core.domain.entity;

import main.ecommerce.core.domain.enums.Unidades;

public class Produto {
    private String nome;
    private String descricao;
    private float valor;
    private Unidades unidade;

    public Produto(String nome, String descricao, float valor, Unidades unidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Unidades getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidades unidade) {
        this.unidade = unidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", unidade=" + unidade +
                '}';
    }
}
