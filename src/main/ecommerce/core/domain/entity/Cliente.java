package main.ecommerce.core.domain.entity;

import main.ecommerce.core.domain.contract.desconto.DescontoRepository;

import java.util.List;

public class Cliente {
    String nome;
    List<DescontoRepository> descontos;

    public Cliente(String nome, List<DescontoRepository> descontos) {
        this.nome = nome;
        this.descontos = descontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<DescontoRepository> getDescontos() {
        return descontos;
    }

    public void setDescontos(List<DescontoRepository> descontos) {
        this.descontos = descontos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", descontos=" + descontos +
                '}';
    }
}
