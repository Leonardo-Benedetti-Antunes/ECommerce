package main.ecommerce.core.domain.usecase.estoque;

import main.ecommerce.core.domain.contract.estoque.CadastroProdutoUseCase;
import main.ecommerce.core.domain.contract.estoque.ProdutoRepository;
import main.ecommerce.core.domain.entity.Carrinho;
import main.ecommerce.core.domain.entity.Estoque;
import main.ecommerce.core.domain.entity.Produto;
import main.ecommerce.core.dto.ProdutoDTO;
import main.ecommerce.core.dto.ProdutoMapper;

public class CadastroProdutoUseCaseImpl implements CadastroProdutoUseCase {

    ProdutoRepository repository;

    public CadastroProdutoUseCaseImpl(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void cadastro(ProdutoDTO produtoDTO, Estoque estoque) {
        estoque.addProdutos(ProdutoMapper.toEntity(produtoDTO));
    }
}
