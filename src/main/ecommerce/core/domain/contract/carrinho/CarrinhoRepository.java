package main.ecommerce.core.domain.contract.carrinho;

import main.ecommerce.core.domain.entity.Carrinho;
import main.ecommerce.core.domain.entity.Produto;

public interface CarrinhoRepository {

    Carrinho obterCarrinho(String id); // ex: id do usuário
    void salvarCarrinho(String id, Carrinho carrinho);
    void removerCarrinho(String id);
}
