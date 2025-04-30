package main.ecommerce.core.domain.contract.estoque;

import main.ecommerce.core.domain.entity.Estoque;
import main.ecommerce.core.dto.ProdutoDTO;

public interface CadastroProdutoUseCase {
    void cadastro(ProdutoDTO produtodto, Estoque estoque);
}
