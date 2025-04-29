package main.ecommerce.core.domain.usecase.carrinho;

import main.ecommerce.core.domain.contract.carrinho.CarrinhoRepository;
import main.ecommerce.core.domain.contract.carrinho.RemoverDoCarrinhoUseCase;
import main.ecommerce.core.domain.entity.Produto;

public class RemoverDoCarrinhoUseCaseImpl implements RemoverDoCarrinhoUseCase {

    public RemoverDoCarrinhoUseCaseImpl(CarrinhoRepository carrinhoRepository) {
        this.carrinhoRepository = carrinhoRepository;
    }

    CarrinhoRepository carrinhoRepository;

    @Override
    public void remover(Produto produto) {

    }
}
