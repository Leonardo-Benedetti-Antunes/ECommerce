package domain.service;

import domain.interfaces.DescontoRepository;

public class Vip implements DescontoRepository {

    @Override
    public double aplicarDesconto(double total) {
        double valorfinal = total - (total * (30.0 / 100.0));
        return valorfinal;
    }
}
