package main.ecommerce;

import main.ecommerce.core.domain.contract.ProductRepository;
import main.ecommerce.infra.memory.MemoryProductRepository;
import main.ecommerce.core.domain.usecase.CadastrarProdutoUseCaseImpl;
import main.ecommerce.core.domain.usecase.ListarProdutosUseCaseImpl;
import main.ecommerce.core.domain.usecase.RemoverProdutoUseCaseImpl;
import main.ecommerce.global.cli.CLIController;

public class Main {
    public static void main(String[] args) {
        // Inicializar repositório e usecases
        ProductRepository repository = new MemoryProductRepository();
        CadastrarProdutoUseCaseImpl cadastrarProdutoUseCase = new CadastrarProdutoUseCaseImpl(repository);
        ListarProdutosUseCaseImpl listarProdutosUseCase = new ListarProdutosUseCaseImpl(repository);
        RemoverProdutoUseCaseImpl removerProdutoUseCase = new RemoverProdutoUseCaseImpl(repository);

        // Criar o controller CLI
        CLIController controller = new CLIController(cadastrarProdutoUseCase, listarProdutosUseCase, removerProdutoUseCase);

        // Exibir o menu
        controller.exibirMenu();
    }
}
