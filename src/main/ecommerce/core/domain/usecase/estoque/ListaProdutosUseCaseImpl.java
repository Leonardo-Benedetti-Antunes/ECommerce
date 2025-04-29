package main.ecommerce.core.domain.usecase.estoque;

import main.ecommerce.core.domain.contract.estoque.ListaProdutosUseCase;
import main.ecommerce.core.domain.contract.estoque.ProdutoRepository;
import main.ecommerce.core.dto.ProdutoDTO;

import java.util.List;

public class ListaProdutosUseCaseImpl implements ListaProdutosUseCase {

    ProdutoRepository repository;

    public ListaProdutosUseCaseImpl(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProdutoDTO> lista() {
        return List.of();
    }
}
