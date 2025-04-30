package main.ecommerce.global.cli;

import main.ecommerce.core.domain.entity.Cliente;

import java.util.Scanner;

public class CLIController {

    private final Scanner scanner;
    private Cliente cliente;
    private final CLIEstoqueController cliEstoqueController;
    private final CLICarrinhoController cliCarrinhoController;
    private final CLIContasController cliContasController;

    public CLIController(CLIEstoqueController cliEstoqueController,
                         CLICarrinhoController cliCarrinhoController,
                         CLIContasController cliContasController,
                         Cliente cliente) {
        this.scanner = new Scanner(System.in);
        this.cliEstoqueController = cliEstoqueController;
        this.cliCarrinhoController = cliCarrinhoController;
        this.cliContasController = cliContasController;
        this.cliente = cliente;
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

            switch (opcao) {
                case 1:
                    cliEstoqueController.exibirMenuEstoque();
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
