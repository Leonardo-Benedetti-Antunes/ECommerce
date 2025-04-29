package main.ecommerce.core.domain.usecase.contas;

import main.ecommerce.core.domain.contract.contas.AcessarContaUseCase;
import main.ecommerce.core.domain.contract.contas.ContaRepository;
import main.ecommerce.core.domain.entity.Cliente;

public class AcessarContaUseCaseImpl implements AcessarContaUseCase {

    ContaRepository contaRepository;

    public AcessarContaUseCaseImpl(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @Override
    public Cliente acessarConta(String nome) {
        return null;
    }
}
