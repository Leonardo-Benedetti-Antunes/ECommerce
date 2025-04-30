package main.ecommerce.core.domain.contract.estoque;

import main.ecommerce.core.domain.entity.Estoque;

public interface RemoveProdutoUseCase {
    void remove(String nome, Estoque estoque);
}
