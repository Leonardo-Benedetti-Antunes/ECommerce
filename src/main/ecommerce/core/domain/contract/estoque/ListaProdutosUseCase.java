package main.ecommerce.core.domain.contract.estoque;

import main.ecommerce.core.domain.entity.Estoque;
import main.ecommerce.core.domain.entity.Produto;

import java.util.List;

public interface ListaProdutosUseCase {
    List<Produto> lista(Estoque estoque);
}
