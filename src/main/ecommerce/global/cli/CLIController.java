package main.ecommerce.global.cli;

import main.ecommerce.core.domain.enums.Unidades;
import main.ecommerce.core.domain.usecase.CadastroProdutoUseCase;
import main.ecommerce.core.domain.usecase.ListaProdutoUseCase;
import main.ecommerce.core.domain.usecase.RemoveProdutoUseCase;
import main.ecommerce.core.dto.ProdutoDTO;
import java.util.Scanner;

public class CLIController {

    private final CadastroProdutoUseCase cadastroProdutoUseCase;
    private final ListaProdutoUseCase listaProdutosUseCase;
    private final RemoveProdutoUseCase removeProdutoUseCase;
    private final Scanner scanner;

    public CLIController(CadastroProdutoUseCase cadastroProdutoUseCase,
                         ListaProdutoUseCase listaProdutosUseCase,
                         RemoveProdutoUseCase removeProdutoUseCase) {
        this.cadastroProdutoUseCase = cadastroProdutoUseCase;
        this.listaProdutosUseCase = listaProdutosUseCase;
        this.removeProdutoUseCase = removeProdutoUseCase;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Remover Produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void cadastrarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Descrição do produto: ");
        String descricao = scanner.nextLine();

        scanner.nextLine(); // Limpar buffer após leitura de float

        Unidades unidade = null;

        while (unidade == null) {
            System.out.print("Selecione a unidade de medida:\n" +
                    "   1. UNIDADE\n" +
                    "   2. kg\n" +
                    "   3. LITRO\n" +
                    "   4. METRO ");
            String unidadeScanner = scanner.nextLine();

            switch (unidadeScanner) {
                case "1":
                    unidade = Unidades.UNIDADE;
                    break;
                case "2":
                    unidade = Unidades.KG;
                    break;
                case "3":
                    unidade = Unidades.LITRO;
                    break;
                case "4":
                    unidade = Unidades.METRO;
                    break;
                default:
                    break;
            }
        }

        System.out.print("Valor do produto: ");
        float valor = scanner.nextFloat();

        ProdutoDTO produtoDTO = new ProdutoDTO(nome, descricao, valor, unidade);
        cadastroProdutoUseCase.cadastro(produtoDTO);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private void listarProdutos() {
        var produtos = listaProdutosUseCase.lista();
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado.");
        } else {
            produtos.forEach(produto -> {
                System.out.println("Produto: " + produto.getNome());
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Valor: " + produto.getValor());
                System.out.println("Unidade: " + produto.getUnidade());
                System.out.println("-----------");
            });
        }
    }

    private void removerProduto() {
        System.out.print("Nome do produto para remover: ");
        String nome = scanner.nextLine();
        removeProdutoUseCase.remove(nome);
        System.out.println("Produto removido com sucesso!");
    }
}
