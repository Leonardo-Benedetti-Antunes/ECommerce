import domain.service.Cupom;
import domain.service.DescontoService;
import domain.service.PrimeiraCompra;
import domain.service.Vip;

public class Main {
    public static void main(String[] args) {

        Vip vip = new Vip();
        PrimeiraCompra primeiraCompra = new PrimeiraCompra();
        Cupom cupom = new Cupom(50);

        DescontoService ds = new DescontoService(vip);

        System.out.println(ds.aplicarDesconto(100));

    }
}