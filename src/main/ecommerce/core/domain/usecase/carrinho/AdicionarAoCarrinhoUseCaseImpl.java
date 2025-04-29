package main.ecommerce.core.domain.usecase.carrinho;

import main.ecommerce.core.domain.contract.carrinho.AdicionarAoCarrinhoUseCase;
import main.ecommerce.core.domain.contract.carrinho.CarrinhoRepository;
import main.ecommerce.core.domain.entity.Carrinho;
import main.ecommerce.core.domain.entity.Produto;

public class AdicionarAoCarrinhoUseCaseImpl implements AdicionarAoCarrinhoUseCase {

    CarrinhoRepository carrinhoRepository;

    public AdicionarAoCarrinhoUseCaseImpl(CarrinhoRepository carrinhoRepository) {
        this.carrinhoRepository = carrinhoRepository;
    }

    @Override
    public void adicionar(Produto produto, Carrinho carrinho, float quantidade) {
        carrinho.addProdutos(produto, quantidade);
    }
}
