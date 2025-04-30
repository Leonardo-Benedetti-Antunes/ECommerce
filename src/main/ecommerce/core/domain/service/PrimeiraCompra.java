package main.ecommerce.core.domain.service;

import main.ecommerce.core.domain.contract.desconto.DescontoRepository;

public class PrimeiraCompra implements DescontoRepository {

    @Override
    public float aplicarDesconto(float total) {
        return total - (total * (50 / 100));
    }
}
