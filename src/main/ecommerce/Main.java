package main.ecommerce;

import main.ecommerce.core.domain.service.Cupom;
import main.ecommerce.core.domain.service.DescontoService;
import main.ecommerce.core.domain.service.PrimeiraCompra;
import main.ecommerce.core.domain.service.Vip;

public class Main {
    public static void main(String[] args) {

        Vip vip = new Vip();
        PrimeiraCompra primeiraCompra = new PrimeiraCompra();
        Cupom cupom = new Cupom(50);

        DescontoService ds = new DescontoService(vip);

        System.out.println(ds.aplicarDesconto(100));

    }
}