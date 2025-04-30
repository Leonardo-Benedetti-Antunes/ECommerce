package main.ecommerce.core.domain.service;

import main.ecommerce.core.domain.contract.desconto.DescontoRepository;

public class DescontoService {
    DescontoRepository descontoRepository;

    public DescontoService(DescontoRepository descontoRepository){
        this.descontoRepository = descontoRepository;
    }

    public double aplicarDesconto(float total){
        return this.descontoRepository.aplicarDesconto(total);
    }
}
