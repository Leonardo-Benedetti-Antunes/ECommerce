package main.ecommerce.core.domain.usecase.contas;

import main.ecommerce.core.domain.contract.contas.ContaRepository;
import main.ecommerce.core.domain.contract.contas.ExcluirContaUseCase;

public class ExcluitContaUseCaseImpl implements ExcluirContaUseCase {

    ContaRepository contaRepository;

    public ExcluitContaUseCaseImpl(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @Override
    public void excluirConta(String nome) {

    }
}
