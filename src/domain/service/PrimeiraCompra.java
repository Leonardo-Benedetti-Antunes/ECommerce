package domain.service;

import domain.interfaces.Desconto;

public class PrimeiraCompra implements Desconto {

    @Override
    public double aplicarDesconto(double total) {
        return total - (total * 0.50);
    }
}
