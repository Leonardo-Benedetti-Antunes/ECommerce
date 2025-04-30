package main.ecommerce.core.domain.usecase.estoque;

import main.ecommerce.core.domain.contract.estoque.ListaProdutosUseCase;
import main.ecommerce.core.domain.contract.estoque.ProdutoRepository;
import main.ecommerce.core.domain.entity.Estoque;
import main.ecommerce.core.domain.entity.Produto;

import java.util.List;

public class ListaProdutosUseCaseImpl implements ListaProdutosUseCase {

    ProdutoRepository repository;

    public ListaProdutosUseCaseImpl(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Produto> lista(Estoque estoque) {
        return estoque.getProdutos();
    }
}
