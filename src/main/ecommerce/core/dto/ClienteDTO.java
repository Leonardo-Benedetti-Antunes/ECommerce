package main.ecommerce.core.dto;

import main.ecommerce.core.domain.contract.desconto.DescontoRepository;

import java.util.List;

public class ClienteDTO {
    String nome;
    List<DescontoRepository> descontos;

    public ClienteDTO(String nome, List<DescontoRepository> descontos) {
        this.nome = nome;
        this.descontos = descontos;
    }

    public String getNome() {
        return nome;
    }

    public List<DescontoRepository> getDescontos() {
        return descontos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", descontos=" + descontos +
                '}';
    }
}
