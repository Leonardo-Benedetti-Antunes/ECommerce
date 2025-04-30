package main.ecommerce.core.domain.contract.contas;

import main.ecommerce.core.domain.entity.Cliente;

public interface CriarContaUseCase {
    Cliente criarConta(String nome, Boolean vip);
}
