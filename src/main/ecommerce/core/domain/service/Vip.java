package main.ecommerce.core.domain.service;

import main.ecommerce.core.domain.contract.desconto.DescontoRepository;

public class Vip implements DescontoRepository {

    @Override
    public double aplicarDesconto(double total) {
        double valorfinal = total - (total * (30.0 / 100.0));
        return valorfinal;
    }
}
