package domain.service;

import domain.interfaces.Desconto;

public class Vip implements Desconto {

    @Override
    public double aplicarDesconto(double total) {
        return total - (total * 0.95);
    }
}
