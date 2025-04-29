package main.ecommerce.core.domain.service;

import main.ecommerce.core.domain.contract.desconto.DescontoRepository;

public class Cupom implements DescontoRepository {
    private float desconto;

    public Cupom(float desconto){
        this.desconto = desconto;
    }

    @Override
    public float aplicarDesconto(float total) {
        return total - (total * (desconto / 100));
    }
}
