package main.ECommerce.core.domain.contract.repository;

import main.ECommerce.core.domain.entity.Produto;

import java.util.List;

public interface ProdutoRepository {
    int create(Produto produto);
    int append(Produto produto);
    List<Produto> read();
    Produto read(int id);
    int update(Produto produto, int id);
    int delete(int id);
}
