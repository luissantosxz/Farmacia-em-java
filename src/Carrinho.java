import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {
    public void realizarCompra(ArrayList<Pessoa> clientes, ArrayList<Produto> produtos) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o CPF do cliente:");
        String cpf = sc.next();
        Pessoa cliente = null;

        for (Pessoa c : clientes) {
            if (c.getCpf().equalsIgnoreCase(cpf)) {
                cliente = c;
                break;
            }
        }

        if (cliente == null) {
            System.out.println("Cliente não encontrado");
            return;
        } else {
            System.out.println("Cliente encontrado:: ");
            System.out.println(cliente.toString());
        }

        System.out.println("DIGITE o ID do produto:");
        int produtoId = sc.nextInt();
        Produto produto = null;
        for (Produto p : produtos) {
            if (p.getId() == produtoId) {
                produto = p;
                break;
            }
        }

        if (produto == null) {
            System.out.println("ERRO Produto não encontrado");
            return;
        } else {
            System.out.println("Produto encontrado: ");
            System.out.println(produto.toString());
        }

        System.out.println("Digite a quantidade desejada:");
        int quantidade = sc.nextInt();

        if (quantidade > produto.getQuantidade()) {
            System.out.println("Quantidade indisponível. Estoque atual: " + produto.getQuantidade());
            return;
        } else {
            produto.setQuantidade(produto.getQuantidade() - quantidade);
            System.out.println("Compra concluida com sucesso!");
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Quantidade comprada: " + quantidade);
            System.out.println("Valor total: R$" + (produto.getPreco() * quantidade));
            System.out.println("Volte sempre Senhor(a) " + cliente.getNome());
        }
    }
}
