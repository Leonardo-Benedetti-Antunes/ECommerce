package main.ecommerce.core.domain.usecase;

import main.ecommerce.core.dto.ProdutoDTO;

public interface RemoveProdutoUseCase {
    void remove(String nome);
}
