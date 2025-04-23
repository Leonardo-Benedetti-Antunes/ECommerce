package domain.service;

import domain.interfaces.Desconto;

public class PrimeiraCompra implements Desconto {

    @Override
    public double aplicarDesconto(double total) {
        return total * 0.50;
    }
}
