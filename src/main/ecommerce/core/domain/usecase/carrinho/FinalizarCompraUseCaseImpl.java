package main.ecommerce.core.domain.usecase.carrinho;

import main.ecommerce.core.domain.contract.carrinho.CarrinhoRepository;
import main.ecommerce.core.domain.contract.carrinho.FinalizarCompraUseCase;
import main.ecommerce.core.domain.entity.Cliente;

public class FinalizarCompraUseCaseImpl implements FinalizarCompraUseCase {

    CarrinhoRepository carrinhoRepository;

    public FinalizarCompraUseCaseImpl(CarrinhoRepository carrinhoRepository) {
        this.carrinhoRepository = carrinhoRepository;
    }

    @Override
    public void finalizarCompra(Cliente cliente) {

    }
}
