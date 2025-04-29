package main.ecommerce.core.domain.usecase.estoque;

import main.ecommerce.core.domain.contract.estoque.ProdutoRepository;
import main.ecommerce.core.domain.contract.estoque.RemoveProdutoUseCase;

public class RemoveProdutoUseCaseImpl implements RemoveProdutoUseCase {

    ProdutoRepository repository;

    public RemoveProdutoUseCaseImpl(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void remove(String nome) {

    }
}
