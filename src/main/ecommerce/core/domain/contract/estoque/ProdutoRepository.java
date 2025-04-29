package main.ecommerce.core.domain.contract.estoque;

import main.ecommerce.core.domain.entity.Produto;
import java.util.List;

public interface ProdutoRepository {
    void save(Produto produto);
    List<Produto> findAll();
    void delete(String nome);
}
