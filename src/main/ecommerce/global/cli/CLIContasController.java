package main.ecommerce.global.cli;

import main.ecommerce.core.domain.contract.contas.CriarContaUseCase;
import main.ecommerce.core.domain.entity.Cliente;

import java.util.Scanner;

public class CLIContasController {
    private Cliente cliente;
    private final Scanner scanner;
    private final CriarContaUseCase criarContaUseCase;

    public CLIContasController(CriarContaUseCase criarContaUseCase, Cliente cliente) {
        this.scanner = new Scanner(System.in);
        this.criarContaUseCase = criarContaUseCase;
        this.cliente = cliente;
    }

    public Cliente exibirMenuContas() {
        while (true) {
            System.out.println("\n=== MENU ESTOQUE ===");
            System.out.println("1. Criar conta");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do scanner

            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    return cliente;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    void criarConta(){
        System.out.print("Nome do Conta: ");
        String nome = scanner.nextLine();

        System.out.print("Conta VIP? ");
        boolean vip = scanner.nextBoolean();

        cliente = criarContaUseCase.criarConta(nome, vip);
    }
}
