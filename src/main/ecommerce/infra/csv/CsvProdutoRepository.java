package main.ecommerce.infra.csv;

import main.ecommerce.core.domain.contract.estoque.ProdutoRepository;
import main.ecommerce.core.domain.entity.Produto;

import java.util.List;

public class CsvProdutoRepository implements ProdutoRepository {
    @Override
    public void save(Produto produto) {

    }

    @Override
    public List<Produto> findAll() {
        return List.of();
    }

    @Override
    public void delete(String nome) {

    }
}
