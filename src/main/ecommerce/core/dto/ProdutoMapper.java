package main.ecommerce.core.dto;

import main.ecommerce.core.domain.entity.Produto;

public class ProdutoMapper {

    public static Produto toEntity(ProdutoDTO dto) {
        return new Produto(
                dto.getNome(),
                dto.getDescricao(),
                dto.getValor(),
                dto.getUnidade()
        );
    }

    public static ProdutoDTO toDTO(Produto produto) {
        return new ProdutoDTO(
                produto.getNome(),
                produto.getDescricao(),
                produto.getValor(),
                produto.getUnidade()
        );
    }
}
