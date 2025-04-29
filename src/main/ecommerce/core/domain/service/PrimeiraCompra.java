package main.ecommerce.core.domain.service;

import main.ecommerce.core.domain.contract.desconto.DescontoRepository;

public class PrimeiraCompra implements DescontoRepository {

    @Override
    public double aplicarDesconto(double total) {
        return total - (total * (50.0 / 100.0));
    }
}
