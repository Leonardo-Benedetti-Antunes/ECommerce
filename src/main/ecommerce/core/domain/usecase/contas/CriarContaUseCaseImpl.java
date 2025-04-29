package main.ecommerce.core.domain.usecase.contas;

import main.ecommerce.core.domain.contract.contas.ContaRepository;
import main.ecommerce.core.domain.contract.contas.CriarContaUseCase;

public class CriarContaUseCaseImpl implements CriarContaUseCase {

    ContaRepository contaRepository;

    public CriarContaUseCaseImpl(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @Override
    public void criarConta(String nome) {

    }
}
