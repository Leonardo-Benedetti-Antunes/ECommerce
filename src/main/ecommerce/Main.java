package main.ecommerce;

import main.ecommerce.core.domain.contract.carrinho.AdicionarAoCarrinhoUseCase;
import main.ecommerce.core.domain.contract.carrinho.CarrinhoRepository;
import main.ecommerce.core.domain.contract.carrinho.FinalizarCompraUseCase;
import main.ecommerce.core.domain.contract.carrinho.RemoverDoCarrinhoUseCase;
import main.ecommerce.core.domain.contract.contas.ContaRepository;
import main.ecommerce.core.domain.contract.contas.CriarContaUseCase;
import main.ecommerce.core.domain.contract.estoque.ProdutoRepository;
import main.ecommerce.core.domain.entity.Carrinho;
import main.ecommerce.core.domain.entity.Cliente;
import main.ecommerce.core.domain.entity.Estoque;
import main.ecommerce.core.domain.usecase.carrinho.AdicionarAoCarrinhoUseCaseImpl;
import main.ecommerce.core.domain.usecase.carrinho.FinalizarCompraUseCaseImpl;
import main.ecommerce.core.domain.usecase.carrinho.RemoverDoCarrinhoUseCaseImpl;
import main.ecommerce.core.domain.usecase.contas.CriarContaUseCaseImpl;
import main.ecommerce.core.domain.usecase.estoque.CadastroProdutoUseCaseImpl;
import main.ecommerce.core.domain.usecase.estoque.ListaProdutosUseCaseImpl;
import main.ecommerce.core.domain.usecase.estoque.RemoveProdutoUseCaseImpl;
import main.ecommerce.global.cli.CLICarrinhoController;
import main.ecommerce.global.cli.CLIContasController;
import main.ecommerce.global.cli.CLIController;
import main.ecommerce.global.cli.CLIEstoqueController;
import main.ecommerce.infra.memory.MemoryCarrinhoRepository;
import main.ecommerce.infra.memory.MemoryContasRepository;
import main.ecommerce.infra.memory.MemoryProdutoRepository;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Carrinho carrinho = new Carrinho();

        Cliente cliente = new Cliente("", new ArrayList<>());

        ProdutoRepository produtoRepository = new MemoryProdutoRepository();

        CarrinhoRepository carrinhoRepository = new MemoryCarrinhoRepository();

        ContaRepository contasRepository = new MemoryContasRepository();

        CadastroProdutoUseCaseImpl cadastrarProdutoUseCase = new CadastroProdutoUseCaseImpl(produtoRepository);
        ListaProdutosUseCaseImpl listarProdutosUseCase = new ListaProdutosUseCaseImpl(produtoRepository);
        RemoveProdutoUseCaseImpl removerProdutoUseCase = new RemoveProdutoUseCaseImpl(produtoRepository);

        AdicionarAoCarrinhoUseCase adicionarAoCarrinhoUseCase = new AdicionarAoCarrinhoUseCaseImpl(carrinhoRepository);
        FinalizarCompraUseCase finalizarCompraUseCase = new FinalizarCompraUseCaseImpl(carrinhoRepository);
        RemoverDoCarrinhoUseCase removerDoCarrinhoUseCase = new RemoverDoCarrinhoUseCaseImpl(carrinhoRepository);

        CriarContaUseCase criarContaUseCase = new CriarContaUseCaseImpl(contasRepository);

        CLIEstoqueController cliEstoqueController = new CLIEstoqueController(estoque, cadastrarProdutoUseCase, listarProdutosUseCase, removerProdutoUseCase);
        CLICarrinhoController cliCarrinhoController = new CLICarrinhoController(carrinho, estoque, adicionarAoCarrinhoUseCase, finalizarCompraUseCase, removerDoCarrinhoUseCase, cliente);
        CLIContasController cliContasControlle = new CLIContasController(criarContaUseCase, cliente);

        CLIController controller = new CLIController(cliEstoqueController, cliCarrinhoController, cliContasControlle, cliente);

        controller.exibirMenu();
    }
}
