package main.ecommerce.global.cli;

import java.util.Scanner;

public class CLIController {

    private final Scanner scanner;
    private final CLIEstoqueController cliEstoqueController;
    private final CLICarrinhoController cliCarrinhoController;
    private final CLIContasController cliContasController;

    public CLIController(CLIEstoqueController cliEstoqueController,
                         CLICarrinhoController cliCarrinhoController,
                         CLIContasController cliContasController) {
        this.scanner = new Scanner(System.in);
        this.cliEstoqueController = cliEstoqueController;
        this.cliCarrinhoController = cliCarrinhoController;
        this.cliContasController = cliContasController;
    }

    public void exibirMenu() {

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Estoque");
            System.out.println("2. Carrinho");
            System.out.println("3. Contas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do scanner

            switch (opcao) {
                case 1:
                    cliEstoqueController.exibirEstoqueProduto();
                    break;
                case 2:
                    cliCarrinhoController.exibirMenuCarrinho();
                    break;
                case 3:
                    cliContasController.exibirMenuContas();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }




}
