package main.ecommerce.infra.memory;

import main.ecommerce.core.domain.contract.carrinho.CarrinhoRepository;
import main.ecommerce.core.domain.entity.Carrinho;

import java.util.HashMap;
import java.util.Map;

public class MemoryCarrinhoRepository implements CarrinhoRepository {

    private final Map<String, Carrinho> carrinhos = new HashMap<>();

    @Override
    public Carrinho obterCarrinho(String id) {
        return new Carrinho();
    }

    @Override
    public void salvarCarrinho(String id, Carrinho carrinho) {
        carrinhos.put(id, carrinho);
    }

    @Override
    public void removerCarrinho(String id) {
        carrinhos.remove(id);
    }
}
