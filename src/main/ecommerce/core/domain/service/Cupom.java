package main.ecommerce.core.domain.service;

import main.ecommerce.core.domain.interfaces.DescontoRepository;

public class Cupom implements DescontoRepository {
    private double desconto;

    public Cupom(double desconto){
        this.desconto = desconto;
    }

    @Override
    public double aplicarDesconto(double total) {
        return total - (total * (desconto / 100.0));
    }
}
