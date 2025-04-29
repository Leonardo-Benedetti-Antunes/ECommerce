package main.ecommerce.core.domain.contract.carrinho;

import main.ecommerce.core.domain.entity.Carrinho;
import main.ecommerce.core.domain.entity.Produto;

public interface AdicionarAoCarrinhoUseCase {
    void adicionar(Produto produto, Carrinho carrinho, float quantidade);
}
