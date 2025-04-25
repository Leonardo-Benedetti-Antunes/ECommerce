package domain.service;

import domain.interfaces.DescontoRepository;

public class PrimeiraCompra implements DescontoRepository {

    @Override
    public double aplicarDesconto(double total) {
        return total - (total * (50.0 / 100.0));
    }
}
