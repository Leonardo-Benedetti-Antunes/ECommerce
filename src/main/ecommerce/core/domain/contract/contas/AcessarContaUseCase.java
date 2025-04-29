package main.ecommerce.core.domain.contract.contas;

import main.ecommerce.core.domain.entity.Cliente;

public interface AcessarContaUseCase {
    Cliente acessarConta(String nome);
}
