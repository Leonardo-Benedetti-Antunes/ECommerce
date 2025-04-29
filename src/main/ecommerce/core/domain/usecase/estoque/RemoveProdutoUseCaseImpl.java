package main.ecommerce.core.domain.usecase.estoque;

import main.ecommerce.core.domain.contract.estoque.ProdutoRepository;
import main.ecommerce.core.domain.contract.estoque.RemoveProdutoUseCase;
import main.ecommerce.core.domain.entity.Estoque;
import main.ecommerce.core.domain.entity.Produto;

import java.util.List;

public class RemoveProdutoUseCaseImpl implements RemoveProdutoUseCase {

    ProdutoRepository repository;

    public RemoveProdutoUseCaseImpl(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void remove(String nome, Estoque estoque) {
        List<Produto> produtos = estoque.getProdutos();
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produtos.remove(produto);
                estoque.setProdutos(produtos);
                return;
            }
        }
        System.out.println("Nenhum produto encontrado");
    }
}
