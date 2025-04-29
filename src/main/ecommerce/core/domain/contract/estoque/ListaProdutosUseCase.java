package main.ecommerce.core.domain.contract.estoque;

import main.ecommerce.core.dto.ProdutoDTO;

import java.util.List;

public interface ListaProdutosUseCase {
    List<ProdutoDTO> lista();
}
