package main.ecommerce.global.cli;

import main.ecommerce.core.domain.contract.contas.AcessarContaUseCase;
import main.ecommerce.core.domain.contract.contas.CriarContaUseCase;
import main.ecommerce.core.domain.contract.contas.ExcluirContaUseCase;

import java.util.Scanner;

public class CLIContasController {

    private final Scanner scanner;
    private final AcessarContaUseCase acessarContaUseCase;
    private final CriarContaUseCase criarContaUseCase;
    private final ExcluirContaUseCase excluirContaUseCase;

    public CLIContasController(AcessarContaUseCase acessarContaUseCase,
                               CriarContaUseCase criarContaUseCase,
                               ExcluirContaUseCase excluirContaUseCase) {
        this.scanner = new Scanner(System.in);
        this.acessarContaUseCase = acessarContaUseCase;
        this.criarContaUseCase = criarContaUseCase;
        this.excluirContaUseCase = excluirContaUseCase;
    }

    public void exibirMenuContas() {
        while (true) {
            System.out.println("\n=== MENU ESTOQUE ===");
            System.out.println("1. Criar conta");
            System.out.println("2. Acessar conta");
            System.out.println("3. Excluir conta");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do scanner

            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    acessarConta();
                    break;
                case 3:
                    excluirConta();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    void criarConta(){

    }

    void acessarConta(){

    }

    void excluirConta(){

    }
}
