package main.ecommerce.core.domain.contract.carrinho;

import main.ecommerce.core.domain.entity.Carrinho;
import main.ecommerce.core.domain.entity.Cliente;

public interface FinalizarCompraUseCase {
    void finalizarCompra(Cliente cliente, Carrinho carrinho);
}
