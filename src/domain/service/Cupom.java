package domain.service;

import domain.interfaces.Desconto;
import domain.interfaces.DescontoCupom;

public class Cupom implements DescontoCupom {

    @Override
    public double aplicarDesconto(double total, double cupom) {
        return total * (cupom / 100);
    }
}
