import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa{
    Scanner sc = new Scanner(System.in);

    public Cliente(String nome, int idade, String genero, String cpf) {
        super(nome, idade, genero, cpf);
    }
    public Cliente(){}

    public void listarClientes(ArrayList<Pessoa> clientes){
        System.out.println("=============================");
        System.out.println("--- Lista de Clientes ---");
        for(Pessoa c : clientes){
            System.out.println(c.toString());
            System.out.println("=============================");
        }
    }

    public void visualizarCliente(ArrayList<Pessoa> clientes) {
        System.out.println("Digite o cpf da pessoa que vc quer encontrar:");
        String cpf = sc.next();
        boolean encontrado = false;
        for (Pessoa p : clientes) {
            if (p.getCpf().equalsIgnoreCase(cpf)) {
                encontrado = true;
                System.out.println(p.toString());
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Cliente não encontrado.");
        }
    }

    public Cliente encontrarClientePorCpf(String cpf, ArrayList<Pessoa> clientes) {
        for (Pessoa cliente : clientes) {
            if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                return (Cliente) cliente;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return  "Cliente:" + "\n" +
                "Nome: " + getNome() + "\n" +
                "idade: " + getIdade() + "\n" +
                "Gênero: " + getGenero() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "ID:" + getId();
    }
}