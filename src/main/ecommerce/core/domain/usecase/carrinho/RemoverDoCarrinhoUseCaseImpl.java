package main.ecommerce.core.domain.usecase.carrinho;

import main.ecommerce.core.domain.contract.carrinho.CarrinhoRepository;
import main.ecommerce.core.domain.contract.carrinho.RemoverDoCarrinhoUseCase;
import main.ecommerce.core.domain.entity.Carrinho;
import main.ecommerce.core.domain.entity.Produto;

import java.util.List;

public class RemoverDoCarrinhoUseCaseImpl implements RemoverDoCarrinhoUseCase {

    public RemoverDoCarrinhoUseCaseImpl(CarrinhoRepository carrinhoRepository) {
        this.carrinhoRepository = carrinhoRepository;
    }

    CarrinhoRepository carrinhoRepository;

    @Override
    public void remover(String nome, Carrinho carrinho) {
        List<Produto> produtos = carrinho.getProdutos();

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                carrinho.getProdutos().remove(i);
                carrinho.getQuantidadeProdutos().remove(i);
                return;
            }
        }
        System.out.println("Nenhum produto encontrado");
    }
}
