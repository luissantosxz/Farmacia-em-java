import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Pessoa> clientes = new ArrayList<>();

        Remedio r = new Remedio();
        Scanner sc = new Scanner(System.in);
        Cliente c = new Cliente();
        Funcionario f = new Funcionario();
        f.instanciaFuncionario(clientes);

        System.out.println("SEJA BEM VINDO A FARMACIA BRASIL!");
        int opcao;
        do {
            System.out.println("=============================");
            System.out.println("||--- ESCOLHA UMA OPÇÃO ---||");
            System.out.println("=============================");
            System.out.println("--- 1 PARA CADASTRAR CLIENTES ");
            System.out.println("--- 2 PARA LISTAR CLIENTES ");
            System.out.println("--- 3 PARA LISTAR FUNCIONARIOS");
            System.out.println("--- 4 PARA CADASTRAR PRODUTOS (REMEDIO) ");
            System.out.println("--- 5 PARA LISTAR PRODUTOS (REMEDIO)");
            System.out.println("--- 6 PARA VISUALIZAR SE CLIENTE ESTA CADASTRADO");
            System.out.println("--- 7 PARA VISUALIZAR REMEDIO");
            System.out.println("--- 8 PARA EDITAR PRODUTOS (REMEDIO)");
            System.out.println("--- 9 PARA EXCLUIR PRODUTOS (REMEDIO)");
            System.out.println("--- 10 PARA VENDA DE REMEDIO");
            System.out.println("--- 0 PARA SAIR");
            System.out.println("=============================");

            opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("SAINDO...");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("=============================");
                    System.out.println("--- Cadastro de Clientes ---");
                    System.out.println("Nome do cliente:");
                    String nome = sc.next();
                    sc.nextLine();
                    System.out.println("Idade do cliente");
                    
                    int idade = sc.nextInt();

                    String genero;

                    do {
                        System.out.println("Genero do cliente \n" +
                                "M - Masculino \n" +
                                "F - Feminino \n" +
                                "O - Outros \n");
                        genero = sc.next();

                        if (!genero.equalsIgnoreCase("m") && !genero.equalsIgnoreCase("f") && !genero.equalsIgnoreCase("o")) {
                            System.out.println(" apenas M, F ou O.");
                        }
                    } while (!genero.equalsIgnoreCase("m") && !genero.equalsIgnoreCase("f") && !genero.equalsIgnoreCase("o"));

                    System.out.println("CPF do Cliente (formato: XXX.XXX.XXX-XX):");
                    String cpf = sc.next();

                    Cliente cli = new Cliente(nome,idade,genero,cpf);
                    clientes.add(cli);
                    System.out.println("=============================");
                    System.out.println("--- CLIENTE CADASTRADO COM SUCESSO! ---");
                    System.out.println("=============================");
                    break;
                case 2:
                    c.listarClientes(clientes);
                    break;
                case 3:
                    f.listaFuncionarios(clientes);
                    break;
                case 4:
                    System.out.println("=============================");
                    System.out.println("--- Cadastro de remedios ---");
                    System.out.println("Nome do remedio: ");
                    String nomeR = sc.next();
                    System.out.println("Preco remedio: ");
                    double preco = sc.nextDouble();
                    System.out.println("Quantidade remedio: ");
                    int qtd = sc.nextInt();
                    System.out.println("MG: ");
                    double mg = sc.nextDouble();
                    System.out.println("Remedio é de uso adulto? TRUE OU FALSE");
                    boolean usoAdulto = Boolean.parseBoolean(sc.next());
                    System.out.println("Necessario receita para compra? TRUE OU FALSE");
                    boolean receita = Boolean.parseBoolean(sc.next());
                    Remedio re = new Remedio(nomeR, preco, qtd, mg, usoAdulto, receita);
                    produtos.add(re);
                    break;
                case 5:
                    r.listaRemedios(produtos);
                    break;
                case 6:
                    c.visualizarCliente(clientes);
                    break;
                case 7:
                    r.encontrarRemedioPorId(produtos);
                    break;
                case 8:
                    r.listaRemedios(produtos);
                    System.out.println("digite o id do remedio que você deseja EDITAR");
                    int idR = sc.nextInt();
                    r.editarRemedio(idR,produtos);
                    break;
                case 9:
                    r.listaRemedios(produtos);
                    System.out.println("digite o id do remedio que você deseja EXCLUIR");
                    int idRa = sc.nextInt();
                    r.removerRemedio(idRa,produtos);
                    break;
                case 10:
                    Carrinho carr = new Carrinho();
                    carr.realizarCompra(clientes, produtos);
            }
        } while (true);
    }
}
