package main.ecommerce.core.domain.usecase.carrinho;

import main.ecommerce.core.domain.contract.carrinho.CarrinhoRepository;
import main.ecommerce.core.domain.contract.carrinho.FinalizarCompraUseCase;
import main.ecommerce.core.domain.entity.Carrinho;
import main.ecommerce.core.domain.entity.Cliente;
import main.ecommerce.core.domain.entity.Produto;
import main.ecommerce.core.domain.service.Vip;

import java.util.List;

public class FinalizarCompraUseCaseImpl implements FinalizarCompraUseCase {

    CarrinhoRepository carrinhoRepository;

    public FinalizarCompraUseCaseImpl(CarrinhoRepository carrinhoRepository) {
        this.carrinhoRepository = carrinhoRepository;
    }

    @Override
    public void finalizarCompra(Cliente cliente, Carrinho carrinho) {
        if (cliente.getNome().equals("")) {
            System.out.println("Por favor, crie uma conta");

        } else {
            List<Produto> produtos = carrinho.getProdutos();
            List<Float> quantidades = carrinho.getQuantidadeProdutos();

            for (int i = 0; i < produtos.size(); i++) {
                carrinho.setValorTotal(carrinho.getValorTotal() + (produtos.get(i).getValor() * quantidades.get(i)));
            }

            if (cliente.getDescontos().size() != 0){
                carrinho.setValorTotal(cliente.getDescontos().getFirst().aplicarDesconto(carrinho.getValorTotal()));
                cliente.getDescontos().remove(0);
            }
            System.out.println("Valor a ser pago:");
            System.out.println(carrinho.getValorTotal());
        }
    }
}
