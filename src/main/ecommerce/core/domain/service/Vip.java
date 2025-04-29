package main.ecommerce.core.domain.service;

import main.ecommerce.core.domain.contract.desconto.DescontoRepository;

public class Vip implements DescontoRepository {

    @Override
    public float aplicarDesconto(float total) {
        float valorfinal = total - (total * (30 / 100));
        return valorfinal;
    }
}
