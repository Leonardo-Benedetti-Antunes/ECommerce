package domain.service;

import domain.interfaces.DescontoRepository;

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
