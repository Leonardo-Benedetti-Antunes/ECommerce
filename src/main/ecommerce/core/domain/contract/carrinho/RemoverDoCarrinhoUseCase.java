package main.ecommerce.core.domain.contract.carrinho;

import main.ecommerce.core.domain.entity.Carrinho;

public interface RemoverDoCarrinhoUseCase {
    void remover(String nome, Carrinho carrinho);
}
