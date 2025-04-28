package main.ecommerce.core.domain.usecase;

import main.ecommerce.core.dto.ProdutoDTO;

import java.util.List;

public interface ListaProdutoUseCase {
    List<ProdutoDTO> lista();
}
