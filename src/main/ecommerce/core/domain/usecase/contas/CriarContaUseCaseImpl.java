package main.ecommerce.core.domain.usecase.contas;

import main.ecommerce.core.domain.contract.contas.ContaRepository;
import main.ecommerce.core.domain.contract.contas.CriarContaUseCase;
import main.ecommerce.core.domain.contract.desconto.DescontoRepository;
import main.ecommerce.core.domain.entity.Cliente;
import main.ecommerce.core.domain.service.PrimeiraCompra;
import main.ecommerce.core.domain.service.Vip;

import java.util.ArrayList;
import java.util.List;

public class CriarContaUseCaseImpl implements CriarContaUseCase {

    ContaRepository contaRepository;

    public CriarContaUseCaseImpl(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @Override
    public Cliente criarConta(String nome, Boolean vip) {
        PrimeiraCompra primeiraCompra = new PrimeiraCompra();
        List<DescontoRepository> descontos = new ArrayList<>();

        descontos.add(primeiraCompra);

        if (vip == true) {
            Vip contaVip = new Vip();
            descontos.add(contaVip);
        }

        return new Cliente(nome, descontos);
    }
}
