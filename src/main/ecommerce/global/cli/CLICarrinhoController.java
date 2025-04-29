package main.ecommerce.global.cli;

import main.ecommerce.core.domain.contract.carrinho.AdicionarAoCarrinhoUseCase;
import main.ecommerce.core.domain.contract.carrinho.FinalizarCompraUseCase;
import main.ecommerce.core.domain.contract.carrinho.RemoverDoCarrinhoUseCase;
import main.ecommerce.core.domain.entity.Estoque;

import java.util.Scanner;

public class CLICarrinhoController {

    private final Scanner scanner;
    private final AdicionarAoCarrinhoUseCase adicionarAoCarrinhoUseCase;
    private final FinalizarCompraUseCase finalizarCompraUseCase;
    private final RemoverDoCarrinhoUseCase removerDoCarrinhoUseCase;

    public CLICarrinhoController(AdicionarAoCarrinhoUseCase adicionarAoCarrinhoUseCase,
                                 FinalizarCompraUseCase finalizarCompraUseCase,
                                 RemoverDoCarrinhoUseCase removerDoCarrinhoUseCase,
                                 Estoque estoque) {
        this.scanner = new Scanner(System.in);
        this.adicionarAoCarrinhoUseCase = adicionarAoCarrinhoUseCase;
        this.finalizarCompraUseCase = finalizarCompraUseCase;
        this.removerDoCarrinhoUseCase = removerDoCarrinhoUseCase;
    }

    public void exibirMenuCarrinho() {
        while (true) {
            System.out.println("\n=== MENU CARRINHO ===");
            System.out.println("1. Adicionar ao carrinho");
            System.out.println("2. Remover do carrinho");
            System.out.println("3. Finalizar compra");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarAoCarrinho();
                    break;
                case 2:
                    removerDoCarrinho();
                    break;
                case 3:
                    finalizarCompra();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void adicionarAoCarrinho() {

    }

    private void removerDoCarrinho() {

    }

    private void finalizarCompra() {

    }
}
