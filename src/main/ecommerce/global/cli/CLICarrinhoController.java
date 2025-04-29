package main.ecommerce.global.cli;

import main.ecommerce.core.domain.contract.carrinho.AdicionarAoCarrinhoUseCase;
import main.ecommerce.core.domain.contract.carrinho.FinalizarCompraUseCase;
import main.ecommerce.core.domain.contract.carrinho.RemoverDoCarrinhoUseCase;
import main.ecommerce.core.domain.entity.Carrinho;
import main.ecommerce.core.domain.entity.Cliente;
import main.ecommerce.core.domain.entity.Estoque;
import main.ecommerce.core.domain.entity.Produto;

import java.util.List;
import java.util.Scanner;

public class CLICarrinhoController {
    private Cliente cliente;
    private final Carrinho carrinho;
    private final Estoque estoque;
    private final Scanner scanner;
    private final AdicionarAoCarrinhoUseCase adicionarAoCarrinhoUseCase;
    private final FinalizarCompraUseCase finalizarCompraUseCase;
    private final RemoverDoCarrinhoUseCase removerDoCarrinhoUseCase;

    public CLICarrinhoController(Carrinho carrinho, Estoque estoque,
                                 AdicionarAoCarrinhoUseCase adicionarAoCarrinhoUseCase,
                                 FinalizarCompraUseCase finalizarCompraUseCase,
                                 RemoverDoCarrinhoUseCase removerDoCarrinhoUseCase,
                                 Cliente cliente) {
        this.scanner = new Scanner(System.in);
        this.carrinho = carrinho;
        this.estoque = estoque;
        this.adicionarAoCarrinhoUseCase = adicionarAoCarrinhoUseCase;
        this.finalizarCompraUseCase = finalizarCompraUseCase;
        this.removerDoCarrinhoUseCase = removerDoCarrinhoUseCase;
        this.cliente = cliente;
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
        System.out.println("Digite o nome do produto que deseja adicionar");
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade que deseja adicionar");
        Float quantidade = scanner.nextFloat();

        List<Produto> produtos = estoque.getProdutos();
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                adicionarAoCarrinhoUseCase.adicionar(produto, carrinho, quantidade);
                return;
            }
        }
        System.out.println("Nenhum produto encontrado");
    }

    private void removerDoCarrinho() {
        System.out.print("Nome do produto para remover: ");
        String nome = scanner.nextLine();
        removerDoCarrinhoUseCase.remover(nome, carrinho);
        System.out.println("Produto removido com sucesso!");
    }

    private void finalizarCompra() {
        finalizarCompraUseCase.finalizarCompra(cliente, carrinho);
    }
}
