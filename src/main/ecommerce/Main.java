package main.ecommerce;

import main.ecommerce.core.domain.contract.carrinho.AdicionarAoCarrinhoUseCase;
import main.ecommerce.core.domain.contract.carrinho.CarrinhoRepository;
import main.ecommerce.core.domain.contract.carrinho.FinalizarCompraUseCase;
import main.ecommerce.core.domain.contract.carrinho.RemoverDoCarrinhoUseCase;
import main.ecommerce.core.domain.contract.contas.AcessarContaUseCase;
import main.ecommerce.core.domain.contract.contas.ContaRepository;
import main.ecommerce.core.domain.contract.contas.CriarContaUseCase;
import main.ecommerce.core.domain.contract.contas.ExcluirContaUseCase;
import main.ecommerce.core.domain.contract.estoque.ProdutoRepository;
import main.ecommerce.core.domain.entity.Estoque;
import main.ecommerce.core.domain.usecase.carrinho.AdicionarAoCarrinhoUseCaseImpl;
import main.ecommerce.core.domain.usecase.carrinho.FinalizarCompraUseCaseImpl;
import main.ecommerce.core.domain.usecase.carrinho.RemoverDoCarrinhoUseCaseImpl;
import main.ecommerce.core.domain.usecase.contas.AcessarContaUseCaseImpl;
import main.ecommerce.core.domain.usecase.contas.CriarContaUseCaseImpl;
import main.ecommerce.core.domain.usecase.contas.ExcluitContaUseCaseImpl;
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

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        ProdutoRepository produtoRepository = new MemoryProdutoRepository();

        CarrinhoRepository carrinhoRepository = new MemoryCarrinhoRepository();

        ContaRepository contasRepository = new MemoryContasRepository();

        CadastroProdutoUseCaseImpl cadastrarProdutoUseCase = new CadastroProdutoUseCaseImpl(produtoRepository);
        ListaProdutosUseCaseImpl listarProdutosUseCase = new ListaProdutosUseCaseImpl(produtoRepository);
        RemoveProdutoUseCaseImpl removerProdutoUseCase = new RemoveProdutoUseCaseImpl(produtoRepository);

        AdicionarAoCarrinhoUseCase adicionarAoCarrinhoUseCase = new AdicionarAoCarrinhoUseCaseImpl(carrinhoRepository);
        FinalizarCompraUseCase finalizarCompraUseCase = new FinalizarCompraUseCaseImpl(carrinhoRepository);
        RemoverDoCarrinhoUseCase removerDoCarrinhoUseCase = new RemoverDoCarrinhoUseCaseImpl(carrinhoRepository);

        AcessarContaUseCase acessarContaUseCase = new AcessarContaUseCaseImpl(contasRepository);
        CriarContaUseCase criarContaUseCase = new CriarContaUseCaseImpl(contasRepository);
        ExcluirContaUseCase excluirContaUseCase = new ExcluitContaUseCaseImpl(contasRepository);

        CLIEstoqueController cliEstoqueController = new CLIEstoqueController(cadastrarProdutoUseCase, listarProdutosUseCase, removerProdutoUseCase, estoque);
        CLICarrinhoController cliCarrinhoController = new CLICarrinhoController(adicionarAoCarrinhoUseCase, finalizarCompraUseCase, removerDoCarrinhoUseCase, estoque);
        CLIContasController cliContasControlle = new CLIContasController(acessarContaUseCase, criarContaUseCase, excluirContaUseCase);

        CLIController controller = new CLIController(cliEstoqueController, cliCarrinhoController, cliContasControlle);

        controller.exibirMenu();
    }
}
