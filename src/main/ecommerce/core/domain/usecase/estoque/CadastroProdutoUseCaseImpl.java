package main.ecommerce.core.domain.usecase.estoque;

import main.ecommerce.core.domain.contract.estoque.CadastroProdutoUseCase;
import main.ecommerce.core.domain.contract.estoque.ProdutoRepository;
import main.ecommerce.core.dto.ProdutoDTO;

public class CadastroProdutoUseCaseImpl implements CadastroProdutoUseCase {

    ProdutoRepository repository;

    public CadastroProdutoUseCaseImpl(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void cadastro(ProdutoDTO produtoDTO) {

    }
}
